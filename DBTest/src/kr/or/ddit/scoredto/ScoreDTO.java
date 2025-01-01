package kr.or.ddit.scoredto;

public class ScoreDTO {
    private int stId;
    private String stName;
    private int kor;
    private int eng;
    private int mat;
    private int tot;
    private int avg;
    private int rank;

    public int getStId() {
        return stId;
    }
    public void setStId(int stId) {
        this.stId = stId;
    }
    public String getStName() {
        return stName;
    }
    public void setStName(String stName) {
        this.stName = stName;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public int getMat() {
        return mat;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public int getTot() {
        return tot;
    }
    public void setTot(int tot) {
        this.tot = tot;
    }
    public int getAvg() {
        return avg;
    }
    public void setAvg(int avg) {
        this.avg = avg;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
}