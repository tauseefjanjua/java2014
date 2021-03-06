package uz.micros.jstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import uz.micros.jstore.entity.Post;
import uz.micros.jstore.service.PostService;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showIndex() {
        List<Post> posts = postService.getPosts();

        return new ModelAndView("index")
                .addObject("posts", posts);
    }
}