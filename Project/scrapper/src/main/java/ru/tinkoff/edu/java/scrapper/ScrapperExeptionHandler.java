package ru.tinkoff.edu.java.scrapper;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.tinkoff.edu.java.scrapper.DTO.response.ApiErrorResponse;

@RestControllerAdvice
public class ScrapperExeptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    Object ApiError(ApiErrorResponse apiErrorResponse){
        return null;
    }

}
