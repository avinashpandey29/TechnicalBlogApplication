package Blog.controller;

import Blog.modal.Post;
import Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    private PostService postservice;
    @RequestMapping("/")
    public String getAllposts(Model model) {

        ArrayList<Post> posts = postservice.getALlPosts();
        model.addAttribute("posts",posts);

        return "index";

    }
}
