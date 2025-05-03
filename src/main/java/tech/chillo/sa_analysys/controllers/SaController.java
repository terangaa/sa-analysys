package tech.chillo.sa_analysys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.chillo.sa_analysys.Sa;

import java.util.List;

@RestController
@RequestMapping("sa")
public class SaController {

    @GetMapping
    public List<Object> search(){
        return List.of(new Sa(1,"Belle formation",1));
    }
}
