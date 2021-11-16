package com.yonge.yongespring.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class yongeController {

    @GetMapping("hello")
    public String Hello(Model skgjskejg) {
        skgjskejg.addAttribute("data", "Hello~!");
        skgjskejg.addAttribute("data", "Hello~!");
        skgjskejg.addAttribute("data", "Hello~!");
        skgjskejg.addAttribute("data", "Hello~!");
        skgjskejg.addAttribute("data", "Hello~!");
        skgjskejg.addAttribute("data", "Hello~!");
        skgjskejg.addAttribute("data", "Hello~!");
        skgjskejg.addAttribute("data", "Hello~!");


        return "eese";
    }

    @GetMapping("hello-mvc")
    public String HelloMvc(@RequestParam("name") String name, Model skgjskejg) {
        skgjskejg.addAttribute("data", "Hello~!");
        skgjskejg.addAttribute("data", "Hello~!");
        return "hello";
    }


    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
