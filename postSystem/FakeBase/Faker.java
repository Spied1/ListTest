package ru.first.spring.postSystem.FakeBase;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class Faker
{
    private Map<Integer,Post> map = this.map = new HashMap<>();;
    int lastId = 11;
    //public Faker(List<Post> allPosts) {
    public Faker()
    {
//        this.allPosts = List.of(
//                new Post("https://s.list.am/h/919/78415919.webp","Mercedes-Benz E-Class, 3.5 л., 2009 г.",9700,"carSale"),
//                new Post("https://s.list.am/h/321/76486321.webp", "Manipulatr.մանիպուլյատոր.манипуляатор, բեռնափոխադրում.կռան",10000,"construction"),
//                new Post("https://s.list.am/h/812/71006812.webp", "Պոլկաներ սառցարան վիտրինա պոլկա սարնարան գորկա հացի պոլկա...",2000,"itemsSale")
//        );

        for(int i = 0; i < 10; ++i) {
            map.put(i, new Post("https://s.list.am/h/919/78415919.webp", "Mercedes-Benz E-Class, 3.5 л., 2009 г.", 9700, "carSale"));
            map.put(i + 1, new Post("https://s.list.am/h/321/76486321.webp", "Manipulatr.մանիպուլյատոր.манипуляатор, բեռնափոխադրում.կռան", 10000, "construction"));
            map.put(i + 2, new Post("https://s.list.am/h/812/71006812.webp", "Պոլկաներ սառցարան վիտրինա պոլկա սարնարան գորկա հացի պոլկա...", 2000, "itemsSale"));
        }
    }

    public void add(Post post)
    {
        System.out.println("TRYING TO ADD");
        map.put(lastId + 1, post);
    }

    public void delete(int id)
    {
        map.remove(id);
    }
    public List<Post> getAllPosts()
    {
        List<Post> temp = new ArrayList<>();

        for (Map.Entry<Integer, Post> entry : map.entrySet()) {
            int key = entry.getKey();
            Post value = entry.getValue();
            temp.add(value);
        }

        return temp;
    }
}
