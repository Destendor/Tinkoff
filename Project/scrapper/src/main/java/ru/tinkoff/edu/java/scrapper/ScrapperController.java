package ru.tinkoff.edu.java.scrapper;

import io.micrometer.common.lang.NonNullApi;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController("/tg-chat/{id}")
public class ScrapperController {
    @PostMapping("/tg-chat/{id}")
    public Object CreateObject(Object object){ return null;}
    @DeleteMapping("/tg-chat/{id}")
    public Object DeleteChat(Object object){
        return null;
    }
    @GetMapping("/links")
    public Object GetLinks(Object object){
        return null;
    }
    @PostMapping("/links")
    public Object AddLinks(Object object){
        return null;
    }
    @DeleteMapping("/links")
    public Object DeleteLink(Object object){
        return null;
    }
}
