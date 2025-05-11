package com.edu.Spring_test_app.controler;

import com.edu.Spring_test_app.domain.User;
import com.edu.Spring_test_app.service.OlaMundoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/olaMundo")
public class olaMundoControler {

    @Autowired
    private OlaMundoService olaMundoService;

    @GetMapping
    public String olaMundo() {
        return olaMundoService.olaMundo("Spring Boot");
    }

    @PostMapping("")
    public String olaMundoPost(@RequestBody User nome){
        return "ola munndo post" + nome.getName();
    }
}
