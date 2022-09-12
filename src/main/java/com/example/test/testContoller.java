package com.example.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class testContoller {

    @PostMapping("/test")
    public void get(@RequestBody(required = false) MultipartFile excel, @RequestBody(required = false) Model name) {
        if (excel != null) {
            System.out.println(excel.getName());
            System.out.println(excel.getOriginalFilename());
            System.out.println(excel.isEmpty());
        }
        System.out.println(name);


    }
}
