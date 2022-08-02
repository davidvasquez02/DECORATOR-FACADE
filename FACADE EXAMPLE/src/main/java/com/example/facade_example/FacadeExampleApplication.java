package com.example.facade_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacadeExampleApplication.class, args);

        FacadeViajes cliente = new FacadeViajes();
        cliente.buscar("14/02/2022","17/02/2022","Bogota","Cancun");

    }

}
