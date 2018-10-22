package com.azure.spring.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class EventController {

    @GetMapping(value = "/events", produces =  MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> getEvents() {
        return Flux.interval(Duration.ofMillis(500)).map(test -> test.toString());
    }
}
