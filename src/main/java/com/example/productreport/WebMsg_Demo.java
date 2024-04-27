package com.example.productreport;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebMsg_Demo  {

    @GetMapping("/webmsg")
    public String getMessage(@RequestParam(value = "message", defaultValue = "Hello") String message) {
        return message;
    }
}