package dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import vo.MovieVO;

import javax.inject.Inject;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO {

    @Inject
    private SqlSession sqlSession;
    private static final String Namespace = "mappers.board-mapper";

    @Override
    public List<MovieVO> selectMovie() throws Exception {

        return sqlSession.selectList(Namespace+".selectMovie");
    }

}
