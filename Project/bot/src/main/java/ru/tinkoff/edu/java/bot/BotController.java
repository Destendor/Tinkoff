package ru.tinkoff.edu.java.bot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.edu.java.bot.DTO.request.LinkUpdate;

@SpringBootApplication
@RestController("/updates")
public class BotController {
    @PostMapping("/updates")
    Object Update(@RequestBody LinkUpdate linkUpdate){
        return null;
    }

}
