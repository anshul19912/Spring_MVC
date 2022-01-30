package com.example.Spring_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/mypage")
    public String mypage(){
        return "mypage";           // this returns mypage.jsp for view
    }

    @RequestMapping("/mvcpage")
    public String mvcpage(Model model){
        model.addAttribute("lanuage","Java");
        model.addAttribute("framework","Spring and Spring Boot");
        model.addAttribute("cloud","Pivotal Cloud Foundry");
        model.addAttribute("devops","Jenkins");
        return "mvcpage";           // this returns mvcpage.jsp for view
    }

    @RequestMapping("/homepage")
    public String homepage(){
        return "homepage";
    }

}
