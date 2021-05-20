package com.tts.TechtTalentBlog.service;


import com.tts.TechtTalentBlog.model.BlogPost;

import java.util.Optional;

// this service is going to serve as a contract
// for our implementation
public interface BlogPostService {

    BlogPost addNewBlogPost(BlogPost blogPost);

}
