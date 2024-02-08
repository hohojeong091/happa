package com.ohgiraffers;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.Template.getSqlSession;

public class MatchingService {

    //private ProgramDTO programDTO ;
    private MatchingMapper matchingMapper ;

    public boolean modifyProgram(ProgramDTO program) {
        SqlSession sqlSession = getSqlSession();

        matchingMapper = sqlSession.getMapper(MatchingMapper.class);
        int result = matchingMapper.updateProgram(program) ;

        if (result > 0 ) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ;


    }

    public boolean registProgram(ProgramDTO program) {
        SqlSession sqlSession = getSqlSession();

        matchingMapper = sqlSession.getMapper(MatchingMapper.class);


        int result = matchingMapper.insertProgram(program);
        System.out.println(result);

        if( result > 0 ) {
            sqlSession.commit();

        } else {
            sqlSession.rollback();

            sqlSession.close();
            

        } return result > 0 ;

    }

    public List<ProgramDTO> selectAllProgram() {

        SqlSession sqlSession = getSqlSession();
        matchingMapper = sqlSession.getMapper(MatchingMapper.class) ;

        List<ProgramDTO> programList = matchingMapper.selectAllProgram();

        sqlSession.close();

        return programList;

    }


    public ProgramDTO selectProgramByCode(int programCode) {

        SqlSession sqlSession = getSqlSession();
        matchingMapper = sqlSession.getMapper(MatchingMapper.class) ;
        //매퍼클래스에 sql으로 접근을 할게

         ProgramDTO programDTO = matchingMapper.selectProgramByCode(programCode);


        sqlSession.close();

        return programDTO ;

    }

    public boolean deleteProgram(int programCode) {
        SqlSession sqlSession = getSqlSession();

        matchingMapper = sqlSession.getMapper(MatchingMapper.class) ;
        int result = matchingMapper.deleteProgram(programCode) ;

        if(result > 0 ) {
            sqlSession.commit();

        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0 ;

    }
}
