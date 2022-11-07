package com.example.webapp.Repositories;

import com.example.webapp.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
