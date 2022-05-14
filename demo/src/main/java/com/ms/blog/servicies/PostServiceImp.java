package com.ms.blog.servicies;

import com.ms.blog.models.Post;
import com.ms.blog.repo.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService{
    private final PostRepository postRepository;

    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Iterable<Post> getAllUsers() {
        return postRepository.findAll();
    }

    @Override
    public Post getUserById(int id) {
        return postRepository.findById((long) id).get();
    }

    @Override
    public void addUser(Post user) {
        postRepository.save(user);
    }

    @Override
    public void removeUser(int id) {
        postRepository.deleteById((long) id);
    }

    @Override
    public void updateUser(int id) {
        postRepository.save(getUserById(id));
    }
}
