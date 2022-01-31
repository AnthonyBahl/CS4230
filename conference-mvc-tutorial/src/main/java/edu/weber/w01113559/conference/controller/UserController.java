package edu.weber.w01113559.conference.controller;

import edu.weber.w01113559.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Anthony") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Bahl") String lastname,
                        @RequestParam(value = "age", defaultValue = "30") int age) {
        System.out.println("getUser was called.");
        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstname: " + user.getFirstname());
        return user;
    }
}
