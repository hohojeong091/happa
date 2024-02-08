package com.ohgiraffers;

import java.util.List;

public interface MatchingMapper {
    List<ProgramDTO> selectAllProgram();

    ProgramDTO selectProgramByCode(int programCode);



    int insertProgram(ProgramDTO program);

    int updateProgram(ProgramDTO program);

    int deleteProgram(int programCode);
}
