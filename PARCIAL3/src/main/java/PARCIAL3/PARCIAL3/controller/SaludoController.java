package PARCIAL3.PARCIAL3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Locale;


@RestController
@RequestMapping("/api")
public class SaludoController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/saludo")
    public Mono<String> obtenerSaludo(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return Mono.just(messageSource.getMessage("saludo", null, locale));
    }
}