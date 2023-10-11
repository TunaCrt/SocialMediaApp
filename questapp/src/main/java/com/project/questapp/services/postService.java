package com.project.questapp.services;

import com.project.questapp.entities.post;
import com.project.questapp.repos.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class postService {

    @Autowired
    private postRepository postRepository;

    public List<post> getAllPosts(Optional<Long> userId) {
        if (userId.isPresent()){
            return postRepository.findByUserId(userId);
        }else
            return postRepository.findAll();
    }

    public post getOnePostById(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    public post createOnePost(post newPost) {
        return postRepository.save(newPost);
    }
}
