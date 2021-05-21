package com.tts.TechtTalentBlog.service;


import com.tts.TechtTalentBlog.model.BlogPost;

import java.util.List;
import java.util.Optional;

// this service is going to serve as a contract
// for our implementation
public interface BlogPostService {

    BlogPost addNewBlogPost(BlogPost blogPost);

    Iterable<BlogPost> getAllBlogPosts();

    void deletePostById(Long id);

//    List<BlogPost> getAllBlogPostsasList();

}
