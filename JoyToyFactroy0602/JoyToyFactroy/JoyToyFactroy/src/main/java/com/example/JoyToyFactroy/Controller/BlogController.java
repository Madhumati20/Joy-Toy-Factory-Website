package com.example.JoyToyFactroy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String showBlog() {
        return "blog";
    }

    @GetMapping("/blog-details")
    public String showBlogDetails() {
        return "blog-details";
    }

    @GetMapping("/blog_details_2")
    public String showBlogDetails2Page() {
        return "blog_details_2"; // This will render blog.html
    }
    @GetMapping("/blog_details_3")
    public String showBlogDetails3Page() {
        return "blog_details_3"; // This will render blog.html
    }
    @GetMapping("/blog_details_4")
    public String showBlogDetails4Page() {
        return "blog_details_4"; // This will render blog.html
    }
    @GetMapping("/blog_details_5")
    public String showBlogDetails5Page() {
        return "blog_details_5"; // This will render blog.html
    }
    @GetMapping("/blog_details_6")
    public String showBlogDetails6Page() {
        return "blog_details_6"; // This will render blog.html
    }
    @GetMapping("/blog_details_7")
    public String showBlogDetails7Page() {
        return "blog_details_7"; // This will render blog.html
    }
    @GetMapping("/blog_details_8")
    public String showBlogDetails8Page() {
        return "blog_details_8"; // This will render blog.html
    }
    @GetMapping("/blog_details_9")
    public String showBlogDetails9Page() {
        return "blog_details_9"; // This will render blog.html
    }
}
