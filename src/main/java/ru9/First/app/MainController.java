package ru9.First.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private UserRepository userR;

    @GetMapping(path="/")
    public String bbb() {
        return "index";
    }

    @GetMapping(path="/add")
    @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        User u = new User();
        u.setEmail(email);
        u.setName(name);
        userR.save(u);
        return "Saved!";
    }

    @GetMapping(path="/all")
    @ResponseBody Iterable<User>
    getAllUsers() {
        return userR.findAll();
    }
}

