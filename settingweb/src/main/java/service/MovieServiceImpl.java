package service;

import dao.MovieDAO;
import org.springframework.stereotype.Service;
import vo.MovieVO;

import javax.inject.Inject;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDAO dao;

    @Override
    public List<MovieVO> selectMovie() throws Exception {

        return dao.selectMovie();
    }

}