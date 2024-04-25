package ru.first.spring.postSystem.FakeBase.postControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.first.spring.postSystem.FakeBase.Faker;
import ru.first.spring.postSystem.FakeBase.Post;

@RestController
public class addPostController
{
    private Faker fakeDb;
    //TODO: add some kind of check if user is loged in or not
    @PostMapping("/addPost")
    public void addPost(@RequestBody Post post)
    {
        System.out.println(post.getTitle());
        fakeDb.add(post);
    }
}
