package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;


@Service
public class PostService {

    private final List<Post> posts = new ArrayList<>();

    {
        posts.add(new Post("Пост 1", new Date()));
        posts.add(new Post("Пост 2", new Date()));
        posts.add(new Post("Пост 3", new Date()));
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

    public List<Post> listAllPosts() {
        return new ArrayList<>(posts);
    }
}