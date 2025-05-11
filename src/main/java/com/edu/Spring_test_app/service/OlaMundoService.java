package com.edu.Spring_test_app.service;

import org.springframework.stereotype.Service;

@Service
public class OlaMundoService {

    public String olaMundo(String nome) {
        return "Ola Mundo " + nome;
    }
}

