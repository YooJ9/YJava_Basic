package kr.or.ddit.service;

import java.util.List;
import java.util.Scanner;

import kr.or.ddit.scoredao.ScoreDAO;
import kr.or.ddit.scoredto.ScoreDTO;
import oracle.jdbc.internal.XSCacheOutput;

public class ScoreService {
    private static ScoreService instance = null;
    private ScoreService() {}

    public static ScoreService getInstance() {
        if (instance == null) instance = new ScoreService();
        return instance;
    }
    int stId;
    String stName;
    int kor;
    int eng;
    int mat;

    Scanner sc=new Scanner(System.in);

    ScoreDAO scoreDAO = ScoreDAO.getInstance();
    String str = "";

    ScoreDTO scoreDTO=new ScoreDTO();



    public void insertData() {
        System.out.print("학번 입력 : ");
        stId = sc.nextInt();
        System.out.print("이름 입력 : ");
        stName = sc.next();
        System.out.print("국어 성적 입력 : ");
        kor = sc.nextInt();
        System.out.print("영어 성적 입력 : ");
        eng = sc.nextInt();
        System.out.print("수학 성적 입력 : ");
        mat = sc.nextInt();


        scoreDTO.setStId(stId);
        scoreDTO.setStName(stName);
        scoreDTO.setKor(kor);
        scoreDTO.setEng(eng);
        scoreDTO.setMat(mat);
        int result=scoreDAO.insertScore(scoreDTO);
        if(result != 0) {
            System.out.println("성적자료가 입력했습니다");
        }else {
            System.out.println("성적자료 입력에 실패했습니다");
        }
    }

    public void selectList() {
        List<ScoreDTO> list=scoreDAO.getList();

        System.out.println("               *** 성 적  LIST ***");
        System.out.println("==============================================");
        System.out.println("학번    이름         국어     영어      수학     총점      평균       등수");
        System.out.println("==============================================");
        for(ScoreDTO dto : list) {
            System.out.printf("%3d  %-5s  %5d %5d %5d %5d %5d %5d",dto.getStId(),
                    dto.getStName(),dto.getKor(),dto.getEng(),dto.getMat(),
                    dto.getTot(),dto.getAvg(),dto.getRank());
            System.out.println();
        }
    }

    public void selectOne() {
        System.out.print("검색할 학번을 입력하세요.. ");
        int stid=Integer.parseInt(sc.nextLine());

        ScoreDTO dto=scoreDAO.selectOne(stid);

        System.out.println("[검색결과]");
        System.out.println("==============================================");
        System.out.println("학번    이름         국어     영어      수학     총점      평균       등수");
        System.out.println("==============================================");
        System.out.printf("%3d  %-5s  %5d %5d %5d %5d %5d %5d",dto.getStId(),
                dto.getStName(),dto.getKor(),dto.getEng(),dto.getMat(),
                dto.getTot(),dto.getAvg(),dto.getRank());
        System.out.println("\n==============================================");
    }
}

