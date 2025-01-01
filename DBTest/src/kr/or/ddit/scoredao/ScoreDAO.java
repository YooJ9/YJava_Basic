package kr.or.ddit.scoredao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.scoredto.ScoreDTO;
import oracle.jdbc.OracleTypes;

public class ScoreDAO {
    private static ScoreDAO instance = null;
    private ScoreDAO() {}
    public static ScoreDAO getInstance() {
        if(instance==null) instance = new ScoreDAO();
        return instance;
    }

    private final String URL = "jdbc:oracle:thin:@localhost:1588/FREEPDB1";
    private final String USER = "PRACTICE";
    private final String PASSWD = "java";

    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private CallableStatement cstmt=null;
    private ResultSet rs = null;

    public int insertScore(ScoreDTO scoreDTO) {
        int result=0;
        String sql="";
        try {
            conn = DriverManager.getConnection(URL,USER,PASSWD);
            sql="{call PROC_INSERT_SCORE(?,?,?,?,?)}";
            cstmt = conn.prepareCall(sql);

            cstmt.setInt(1, scoreDTO.getStId());
            cstmt.setString(2, scoreDTO.getStName());
            cstmt.setInt(3, scoreDTO.getKor());
            cstmt.setInt(4, scoreDTO.getEng());
            cstmt.setInt(5, scoreDTO.getMat());
            result = cstmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(cstmt!=null) try {cstmt.close();} catch(Exception e) {}
            if(conn!=null) try {conn.close();} catch(Exception e) {}
        }
        return result;
    }

    public List<ScoreDTO> getList(){

        List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
        String sql;

        try {
            conn = DriverManager.getConnection(URL,USER,PASSWD);
            sql = "{call PROC_SELECT_ALL(?)}";//전체데이터를 select한 결과 presult가 들어가므로 ?가 1개. presult는 오라클에서 커서에 해당.

            cstmt = conn.prepareCall(sql);
            //out파라미터의 자료형 설정(커서를 받아낼 데이터 타입을 생성)
            cstmt.registerOutParameter(1,OracleTypes.CURSOR);
            cstmt.executeUpdate();
            //out파라미터의 값을 돌려받는다
            rs = (ResultSet)cstmt.getObject(1); //cstmt실행결과를 object로 받아 downcast
            while(rs.next()){
                //레코드에 있는 내용을 dto에 입력
                ScoreDTO dto = new ScoreDTO();

                dto.setStId(rs.getInt(1));
                dto.setStName(rs.getString(2));
                dto.setKor(rs.getInt(3));
                dto.setEng(rs.getInt(4));
                dto.setMat(rs.getInt(5));
                dto.setTot(rs.getInt(6));
                dto.setAvg(rs.getInt(7));
                dto.setRank(rs.getInt(8));

                lists.add(dto);
            }
        } catch (Exception e) {
            System.out.println("에러");

        }finally {
            if(rs!=null) try {rs.close();} catch(Exception e) {}
            if(cstmt!=null) try {cstmt.close();} catch(Exception e) {}
            if(conn!=null) try {conn.close();} catch(Exception e) {}
        }
        return lists;
    }

    public ScoreDTO selectOne(int stid){

        ScoreDTO dto = null;
        String sql;

        try {
            conn = DriverManager.getConnection(URL,USER,PASSWD);
            sql = "{call SELECT_ONE_STID(?,?)}";//물음표 변수의 순서는 out, in

            cstmt = conn.prepareCall(sql);

            //out 파라미터 자료형 설정
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            //in 파라미터
            cstmt.setInt(2,stid);

            //프로시져 실행
            cstmt.executeQuery();

            //out파라미터의 값 돌려 받기
            rs = (ResultSet)cstmt.getObject(1);

            //데이터가 있거나 없거나 둘중 하나
            if(rs.next()){
                dto = new ScoreDTO();
                dto.setStId(rs.getInt(1));
                dto.setStName(rs.getString(2));
                dto.setKor(rs.getInt(3));
                dto.setEng(rs.getInt(4));
                dto.setMat(rs.getInt(5));
                dto.setTot(rs.getInt(6));
                dto.setAvg(rs.getInt(7));
                dto.setRank(rs.getInt(8));
            }

        }catch (Exception e) {
            System.out.println(e.toString());
        }finally {
            if(rs!=null) try {rs.close();} catch(Exception e) {}
            if(cstmt!=null) try {cstmt.close();} catch(Exception e) {}
            if(conn!=null) try {conn.close();} catch(Exception e) {}
        }
        return dto;
    }
}
