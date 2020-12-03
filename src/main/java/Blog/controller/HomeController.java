package Blog.controller;

import Blog.modal.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllposts(Model model) {

        ArrayList<Post> posts = new ArrayList<Post>();
        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("post setbody 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("post setbody 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("post setbody 3");
        post3.setDate(new Date());
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        model.addAttribute("posts",posts);

        return "index";

    }
}
