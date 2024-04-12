package org.example.furryfootstepsapi.service.impl;

import org.example.furryfootstepsapi.model.Post;
import org.example.furryfootstepsapi.repository.PostRepository;
import org.example.furryfootstepsapi.service.PostService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return this.postRepository.findAll();
    }


}