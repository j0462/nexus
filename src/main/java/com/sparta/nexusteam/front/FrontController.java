package com.sparta.nexusteam.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/login")
    public String login(){
        return "login.html";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup.html";
    }

    @GetMapping("/main")
    public String home(){
        return "home.html";
    }

    @GetMapping("/work")
    public String work(){
        return "work.html";
    }

    @GetMapping("/work/myWork")
    public String myWork(){ return "mywork.html"; }
    
    @GetMapping("/work/companyWork")
    public String companyWork(){ return "companywork.html"; }
}
