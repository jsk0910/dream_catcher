package com.dream.catcher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/law")
    public String laws() {
        return "laws";
    }

    @GetMapping("/web")
    public String web() { 
        return "web2";
    }
}
