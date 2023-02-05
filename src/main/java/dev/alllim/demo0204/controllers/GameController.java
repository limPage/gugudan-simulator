package dev.alllim.demo0204.controllers;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "/")
public class GameController {

    @GetMapping(value = "/",produces = MediaType.TEXT_HTML_VALUE )
    public ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView("games/gugudan");
        return modelAndView;
    }
}
