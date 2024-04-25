package ru.first.spring.postSystem.FakeBase.postControllers;

import org.springframework.web.bind.annotation.*;
import ru.first.spring.postSystem.FakeBase.Faker;
import ru.first.spring.postSystem.FakeBase.Post;


@RestController
public class deleteController
{
    private Faker fakeDb;
    //TODO: add check for login
    @DeleteMapping("/deletePost")
    void deletePost(@RequestBody Id id)
    {
        System.out.println("Delete Execution");

        fakeDb.delete(id.id);
    }
}

class Id
{
    int id;
}