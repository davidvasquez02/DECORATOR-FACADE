package com.example.decoratorexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorExampleApplication.class, args);

        Automovil carro = new CarroEstandar("Renault");

        carro.arrancar();
        carro.apagar();

        Automovil carroElectrico = new AutoElectricoDecorado(new CarroEstandar("Tesla"));
        //carro = new AutoElectricoDecorado(carro);

        carroElectrico.arrancar();
        carroElectrico.apagar();


    }

}
