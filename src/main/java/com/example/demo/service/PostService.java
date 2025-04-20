package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();

        posts.add(new Post("бебебе"));
        posts.add(new Post("бубубу"));
        posts.add(new Post("пупупу"));

        return posts;
    }
}