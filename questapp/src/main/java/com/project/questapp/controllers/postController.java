package com.project.questapp.controllers;

import com.project.questapp.entities.post;
import com.project.questapp.services.postService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class postController {

    private postService postService;

    public postController(com.project.questapp.services.postService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<post> getAllPosts(@RequestParam Optional<Long> userId){
        return postService.getAllPosts(userId);
    }

    @GetMapping("/{postId}")
    public post getOnePost(@PathVariable Long postId){
        return postService.getOnePostById(postId);
    }

    @PostMapping
    public post createOnePost(@RequestBody post newPost){
        return postService.createOnePost(newPost);
    }



}
