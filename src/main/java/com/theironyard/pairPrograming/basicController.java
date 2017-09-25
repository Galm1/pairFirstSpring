package com.theironyard.pairPrograming;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class basicController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(path = "/splash", method = RequestMethod.GET)
    public String splash(){
        return "splash";
    }

}
