package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();

        posts.add(new Post("пост 1"));
        posts.add(new Post("пост 2"));
        posts.add(new Post("пост 3"));

        return posts;
    }
}