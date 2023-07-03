package com.example.Spring_MVC.controller;

import com.example.Spring_MVC.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class WebController {

    @RequestMapping("/mypage")
    public String mypage(){
        return "mypage";           // this returns mypage.jsp for view
    }

    @RequestMapping("/mvcpage")
    public String mvcpage(Model model){                                       // the model stores values like hashmap in key,value pair
        model.addAttribute("lanuage","Java");
        model.addAttribute("framework","Spring and Spring Boot");
        model.addAttribute("cloud","Pivotal Cloud Foundry");
        model.addAttribute("devops","Jenkins");
        return "mvcpage";           // this returns mvcpage.jsp for view
    }


    //1st page
    @RequestMapping("/homepage")
    public String homepage(){
        return "homepage";
    }

    //2nd page
    @RequestMapping(value = "/hello",method = POST)
    public String sayHello(@RequestParam("name") String name, Model model) {
        model.addAttribute("USER_ID", name);  // key and value
        model.addAttribute("name","JAVA");
        model.addAttribute("branch","Information Technology");

        Student student=new Student("Rahul",12,"Computer science");

        model.addAttribute("Student",student);// key and value

        return "hello";// returning hello.jsp view name


    }
}
