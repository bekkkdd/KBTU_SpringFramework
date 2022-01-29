package kz.bekdauelet.practice_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping
    public String greeting() {
        return "Hello World!";
    }
}
