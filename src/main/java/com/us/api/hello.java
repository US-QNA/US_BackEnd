package com.us.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {
    @GetMapping("/")
    public String h() {
        return "hello";
    }
}
