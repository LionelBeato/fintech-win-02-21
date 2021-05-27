package com.tts.TechtTalentBlog.controller;

import com.tts.TechtTalentBlog.model.BlogPost;
import com.tts.TechtTalentBlog.repository.BlogPostRepository;
import com.tts.TechtTalentBlog.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@Controller
@RequestMapping("/blogposts")
public class BlogPostController {



    @Autowired
    BlogPostService blogPostService;


//    public BlogPostController(BlogPostService blogPostService) {
//        this.blogPostService = blogPostService;
//    }

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
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostService.addNewBlogPost(blogPost);
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }

    // method to check orderby methods
//    @GetMapping("/json")
//    @ResponseBody
//    public Iterable<Book> getAllDesc() {
//        return blogPostRepository.findByOrderByTitleAsc();
//    }

    @DeleteMapping("/{id}")
    public String deletePostWithId(@PathVariable Long id, BlogPost blogPost) {
        blogPostService.deletePostById(id);
        return "redirect:/blogposts";
    }

    @GetMapping("/{id}")
    public String editPostWithId(@PathVariable Long id,
                                 BlogPost blogpost,
                                 Model model) {

        BlogPost foundPost = blogPostService.findBlogPostById(id);
        model.addAttribute("blogPost", foundPost);

//        Optional<BlogPost> post = blogPostRepository.findById(id);
//        if (post.isPresent()) {
//            BlogPost actualPost = post.get();
//            model.addAttribute("blogPost", actualPost);
//        }


        return "blogpost/edit";
    }

    @PostMapping("/update/{id}")
    public String updateExistingPost(@PathVariable Long id,
                                     BlogPost blogPost,
                                     Model model) {

//        Optional<BlogPost> post = blogPostRepository.findById(id);
//        if (post.isPresent()) {
//            BlogPost actualPost = post.get();
//            actualPost.setTitle(blogPost.getTitle());
//            actualPost.setAuthor(blogPost.getAuthor());
//            actualPost.setBlogEntry(blogPost.getBlogEntry());
//            blogPostRepository.save(actualPost);
//            model.addAttribute("blogPost", actualPost);
//        }

        BlogPost editedPost = blogPostService.editBlogPostById(id, blogPost);
        model.addAttribute("blogPost", editedPost);

        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());

        return "blogpost/result";
    }


}
