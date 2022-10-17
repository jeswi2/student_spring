package com.example.courseapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/")
        public String Homepage(){
        return "Welcome to Home page";
    }

    @PostMapping("/read")
    public String Readpage(){
        return "read page";
    }

    @GetMapping("/viewall")
    public List viewall(){
        List<String> mylist=new ArrayList<>();
        mylist.add("{'name':'jeswin','age':'21'}");
        return mylist;
    }


}
