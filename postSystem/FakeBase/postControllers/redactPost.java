package ru.first.spring.postSystem.FakeBase.postControllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.first.spring.postSystem.FakeBase.Post;

@RestController
public class redactPost {

    @PutMapping("/update/")
    void updateInfo(@RequestBody Post post)
    {

    }
}
