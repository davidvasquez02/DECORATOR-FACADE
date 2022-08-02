package com.example.decoratorexample;

public class CarroEstandar implements Automovil{

    private String nombre;

    public CarroEstandar(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void arrancar() {
        System.out.println("Encendiendo el carro");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el carro");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando");

    }
}
