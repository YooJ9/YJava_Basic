package kr.or.ddit.controller;

import kr.or.ddit.service.ScoreService;

public class ScoreMain {

    public static void main(String[] args) {
        ScoreService service=ScoreService.getInstance();
        service.insertData();
        service.selectList();
        //service.selectOne();
    }
}