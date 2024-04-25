package ru.first.spring.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController
{
    @GetMapping("/login")
    @PostMapping
    public void Login(@RequestBody Profile profile)
    {
        System.out.println(profile.name);
        System.out.println(profile.address);
    }
}

