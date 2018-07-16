package logintest.demo.controller;

import logintest.demo.DTO.UserDTO;
import logintest.demo.DTO.WelcomeDTO;
import logintest.demo.entities.UsersEntity;
import logintest.demo.repository.UserRepository;
import logintest.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginRestController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(){
        return "This is working";
    }
    @GetMapping("/greeting")
    public WelcomeDTO greeting(){
        WelcomeDTO DTO = new WelcomeDTO("1","Hallo. This is your Greeting");
        return DTO;
    }
    //TODO create GET /getUser method. This method will query the Users table via spring data, and return data to the front end where it will display "Welcome <firstname> <lastname>"

    @GetMapping("/getUser")
    public UserDTO getUser(@RequestParam(value="username" )  String username , @RequestParam(value="password" ) String password) throws Exception{


        UsersEntity user = userService.getUser(username,password);
        String us = "Welcome" + user.getFirstName() + " " + user.getLastName();
        return new UserDTO(user.getFirstName(),user.getLastName());
    }


}
