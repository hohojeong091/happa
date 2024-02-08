package com.ohgiraffers;

import java.time.LocalDate;
import java.util.Date;

public class ProgramDTO {

    private int programCode ;
    private String programName ;
    private LocalDate programOpenDate ;
    private String programCategory ;

    public ProgramDTO() {
    }

    public ProgramDTO(int programCode, String programName, LocalDate programOpenDate, String programCategory) {
        this.programCode = programCode;
        this.programName = programName;
        this.programOpenDate = programOpenDate;
        this.programCategory = programCategory;
    }

    public int getProgramCode() {
        return programCode;
    }

    public void setProgramCode(int programCode) {
        this.programCode = programCode;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public LocalDate getProgramOpenDate() {
        return programOpenDate;
    }

    public void setProgramOpenDate(LocalDate programOpenDate) {
        this.programOpenDate = programOpenDate;
    }

    public String getProgramCategory() {
        return programCategory;
    }

    public void setProgramCategory(String programCategory) {
        this.programCategory = programCategory;
    }

    @Override
    public String toString() {
        return "ProgramDTO{" +
                "programCode=" + programCode +
                ", programName='" + programName + '\'' +
                ", programOpenDate=" + programOpenDate +
                ", programCategory='" + programCategory + '\'' +
                '}';
    }
}
