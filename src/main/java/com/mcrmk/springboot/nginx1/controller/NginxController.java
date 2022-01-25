package com.mcrmk.springboot.nginx1.controller;

import com.mcrmk.springboot.nginx1.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class NginxController {

    @GetMapping("mensaje")
    public List<Message> testNginx(){
        return List.of(new Message("Hola Mundo"), new Message("Server 1"));
    }

}
