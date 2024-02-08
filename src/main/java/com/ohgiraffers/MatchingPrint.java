package com.ohgiraffers;

import java.util.List;

public class MatchingPrint {
    public void printProgramList(List<ProgramDTO> programList) {
        System.out.println(" ==== 전체 프로그램 조회 ==== ");
        for(ProgramDTO program : programList) {
            System.out.println(program);
        }
    }


    public void printErrorMessage(String errorCode) {

        System.out.println(" ==== Error ==== ");
        String errorMessage = " ";
        switch (errorCode) {
            case "selectAllProgram" :
                errorMessage = "프로그램 목록 조회에 실패했습니다." ; break;
            case "selectCode" :
                errorMessage = "해당하는 코드에 맞는 프로그램을 찾지 못했습니다." ; break ;
            case "insert" :
                errorMessage = "프로그램 추가에 실패하였습니다." ; break ;
            case "update" :
                errorMessage = "프로그램 수정에 실패하였습니다." ; break ;
        }
    }

    public void printProgram(ProgramDTO program) {
        System.out.println(" ==== 프로그램 코드로 조회 ==== ");
        System.out.println(program);

    }

    public void printSuccessMessage(String successCode) {
        System.out.println(" ====== SUCESS ======");

        String successMessage = "" ;
                switch (successCode) {
                    case "insert" :
                        successMessage = "신규 메뉴 등록이 완료 되었습니다." ; break;
                    case "updete" :
                        successMessage = "프로그램 수정이 완료 되었습니다." ; break ;
                }

    }
}
