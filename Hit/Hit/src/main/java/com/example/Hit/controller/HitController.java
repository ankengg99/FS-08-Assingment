package com.example.Hit.controller;

import com.example.Hit.module.Hit;
import com.example.Hit.service.HitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/visitor-app")
public class HitController {
//localhost:8080/api/v1/visitor-app/count/username/sonu
    @GetMapping("/username/{username}")
    public HashMap<String,Hit> getHitCount(@PathVariable String username){
        HitService hitService=new HitService();
        return hitService.addUser(username);
    }
}
