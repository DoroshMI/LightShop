package ua.lviv.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by User on 29.05.2017.
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String loadIndex(){
        return "index";
    }
}
