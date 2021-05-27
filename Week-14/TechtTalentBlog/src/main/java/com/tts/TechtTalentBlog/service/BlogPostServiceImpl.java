package com.tts.TechtTalentBlog.service;

import com.tts.TechtTalentBlog.model.BlogPost;
import com.tts.TechtTalentBlog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    @Autowired
    BlogPostRepository blogPostRepository;

//    public BlogPostServiceImpl(BlogPostRepository blogPostRepository) {
//        this.blogPostRepository = blogPostRepository;
//    }

    @Override
    public BlogPost addNewBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    @Override
    public Iterable<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    @Override
    public void deletePostById(Long id) {
        blogPostRepository.deleteById(id);
    }

    @Override
    public BlogPost findBlogPostById(Long id) {
        return blogPostRepository.findById(id).orElseThrow();
    }

    @Override
    public BlogPost editBlogPostById(Long id, BlogPost blogPost) {
        // we need to find our object
        BlogPost foundPost = findBlogPostById(id);
        // now we need to edit our object
        foundPost.setBlogEntry(blogPost.getBlogEntry());
        foundPost.setAuthor(blogPost.getAuthor());
        foundPost.setTitle(blogPost.getTitle());
        return addNewBlogPost(foundPost);
    }

}
