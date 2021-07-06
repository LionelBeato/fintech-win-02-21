package com.tts.TechtTalentBlog.controller;

import com.tts.TechtTalentBlog.model.BlogPost;
import com.tts.TechtTalentBlog.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blogposts")
public class BlogPostController {

    @Autowired
    BlogPostService blogPostService;

    @GetMapping
    public String index(BlogPost blogPost, Model model) {
        model.addAttribute("posts", blogPostService.getAllBlogPosts());
        // this return value is a reference to a template
        // it will not literally return a string value
        return "blogpost/index";
    }

    @GetMapping("/new")
    public String newBlog(BlogPost blogPost) {
        return "blogpost/new";
    }

    @PostMapping
    public String addNewBlogPost(BlogPost blogPost) {
        blogPostService.addNewBlogPost(blogPost);
        return "blogpost/result";
    }

    @DeleteMapping("/{id}")
    public String deletePostWithId(@PathVariable Long id) {
        blogPostService.deletePostById(id);
        return "redirect:/blogposts";
    }

    // this retrieves our post that we want to edit
    // it'll send us to our edit template page
    @GetMapping("/{id}")
    public String editPostWithId(@PathVariable Long id, Model model) {

        BlogPost foundPost = blogPostService.findBlogPostById(id);
        model.addAttribute("blogPost", foundPost);
        return "blogpost/edit";
    }

    // one way of rendering a blogpost, here we define a model attribute over a method
    // that returns an instance of BlogPost
//    @ModelAttribute("blogPost")
//    public BlogPost getBlogPost() {
//        return new BlogPost();
//    }

    // this will perform the actual edit via a POST method
    // this should technically be a put, but using a post is common and will work the same
    @PostMapping("/update/{id}")
    public String updateExistingPost(@PathVariable Long id,
                                     BlogPost blogPost,
                                     Model model) {

        BlogPost editedPost = blogPostService.editBlogPostById(id, blogPost);
        model.addAttribute("blogPost", editedPost);
        return "blogpost/result";
    }

}
