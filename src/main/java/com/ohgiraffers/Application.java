package com.ohgiraffers;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {




    public static void main(String[] args) {

        MatchingController matchingController = new MatchingController();
        Scanner sc = new Scanner(System.in);

        do    {
            System.out.println(" === 메뉴 관리 시스템 === ");
            System.out.println(" ====================================");
            System.out.println(" 1. 멘토링 프로그램 전체 조회 ");
            System.out.println(" 2. 프로그램 코드로 조회 ");
            System.out.println(" 3. 신규 프로그램 추가 ");
            System.out.println(" 4. 프로그램 수정  ");
            System.out.println(" 5. 프로그램 삭제 ") ;
            System.out.println(" 9. 프로그램 종료  ");
            System.out.println(" ====================================");
            System.out.println(" 프로그램 관리 번호 입력 : ");


            int no = sc.nextInt();

            switch (no) {
                case 1:
                    matchingController.selectAllProgram();   break;

                case 2:
                    matchingController.selectProgramByCode(inputProgramCode()); break ;

                case 3:
                    matchingController.registProgram(inputProgram()); break;
                case 4:
                    matchingController.modifyProgram(inputModifyProgram()); break;

                case 5 :
                    matchingController.deleteProgram(inputProgramCode()); break ;
                case 9:
                    System.out.println(" 프로그램을 종료합니다. ");
                    return;
                default:
                    System.out.println(" 잘못된 번호입니다. 다시 입력해 주세요.");
                    break;
            }
        } while(true);
    }

    private static Map<String, String> inputModifyProgram() {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("수정할 프로그램 코드를 입력하세요 : ");
        String programCode = sc.nextLine();
        System.out.println("수정할 프로그램 이름을 입력하세요 : ");
        String programName = sc.nextLine();
        System.out.println("수정할 프로그램 시작일을 입력하세요 : ");
        String programOpendate = sc.nextLine();
        System.out.println("수정할 프로그램의 종류를 입력하세요 : ");
        String programCategory = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("programCode", programCode);
        parameter.put("programName", programName);
        parameter.put("programOpenDate", programOpendate);
        parameter.put("programCategory", programCategory);

        return parameter ;
    }

    private static Map<String, String> inputProgram() {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("프로그램 이름을 입력하세요 : ");
        String programName = sc.nextLine();

        System.out.println("프로그램 시작일을 입력하세요 (YYYY-mm-DD) : ");
        String programOpendate = sc.nextLine();

        System.out.println("프로그램 종류를 입력하세요 : ");
        String programCategory = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("programName", programName);
        parameter.put("programOpendate", programOpendate);
        parameter.put("programCategory",programCategory);

        return parameter;




    }

    private static Map<String, String> inputProgramCode() {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("메뉴 코드를 입력하세요 : ");
        String programCode = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("programCode", programCode) ;



        return parameter ;
    }


}
