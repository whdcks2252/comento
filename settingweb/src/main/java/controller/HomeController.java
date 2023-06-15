package controller;

import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.MovieService;
import vo.MovieVO;

import javax.inject.Inject;
import java.util.List;
import java.util.Locale;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log
public class HomeController {


    @Inject
    private MovieService service;
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String home(Locale locale, Model model) throws Exception{
    log.info("home");

        List<MovieVO> movieList = service.selectMovie();

        model.addAttribute("movieList", movieList);

        return "home";
    }

}