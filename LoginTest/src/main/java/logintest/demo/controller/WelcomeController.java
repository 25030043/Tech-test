package logintest.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {


    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome.html";
    }
    @RequestMapping("/login")
    public String login(Map<String, Object> model) {
        model.put("message", "Add your login code here");

        return "login.html";
    }

}