package com.example.springreact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@Controller
public class HomeController {
 
    @RequestMapping(value = "/")
    public String index() {
    	System.out.println("test");
        return "index.html";
    }
}
