package com.cj.file_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }
    @RequestMapping("/{name}")
    public String showView(@PathVariable("name") String name) {
        return name;
    }
}
