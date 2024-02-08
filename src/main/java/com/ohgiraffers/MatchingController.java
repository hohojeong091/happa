package com.ohgiraffers;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class MatchingController {

    private final MatchingService matchingService ;
    private final MatchingPrint matchingPrint;

    public MatchingController() {
        this.matchingService = new MatchingService();
        this.matchingPrint = new MatchingPrint();
    }


    public void selectAllProgram () {
        List<ProgramDTO> programList = matchingService.selectAllProgram();

        if(programList != null ) {
            matchingPrint.printProgramList(programList) ;
        } else {
            matchingPrint.printErrorMessage("selectAllProgram");
        }

    }

    public void selectProgramByCode (Map<String, String> parameter) {
        int programCode = Integer.parseInt(parameter.get("programCode"));

        ProgramDTO program = matchingService.selectProgramByCode(programCode) ;

        if(program != null ) {
            matchingPrint.printProgram(program);
        } else {
            matchingPrint.printErrorMessage("selectCode");
        }

    }


    public void registProgram(Map<String, String> parameter) {

        ProgramDTO program = new ProgramDTO();


        program.setProgramName(parameter.get("programName"));
        program.setProgramOpenDate(LocalDate.parse(parameter.get("programOpendate")));
        program.setProgramCategory(parameter.get("programCategory"));



        if(matchingService.registProgram(program)) {
            matchingPrint.printSuccessMessage("insert") ;
        } else {
            matchingPrint.printErrorMessage("insert");
        }

    }

    public void modifyProgram (Map<String, String> parameter) {

        ProgramDTO program = new ProgramDTO();
        program.setProgramCode(Integer.parseInt(parameter.get("programCode")));
        program.setProgramName(parameter.get("programName"));
        program.setProgramOpenDate(LocalDate.parse(parameter.get("programOpendate")));
        program.setProgramCategory(parameter.get("programCategory"));

        if(matchingService.modifyProgram(program)) {
            matchingPrint.printSuccessMessage("update") ;
        } else {
            matchingPrint.printErrorMessage("update") ;
        }

    }

    public void deleteProgram(Map<String, String> parameter) {

        int programCode = Integer.parseInt(parameter.get("programCode")) ;

        if(matchingService.deleteProgram(programCode)) {
            matchingPrint.printSuccessMessage("delete");
        } else {
            matchingPrint.printErrorMessage("delete");
        }
    }
}
