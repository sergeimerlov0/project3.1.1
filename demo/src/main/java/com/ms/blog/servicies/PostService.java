package com.ms.blog.servicies;

import com.ms.blog.models.Post;

public interface PostService {
    Iterable<Post> getAllUsers ();
    Post getUserById (int id);
    void addUser (Post user);
    void removeUser (int id);
    void updateUser (int id);
}
