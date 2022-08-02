package com.example.decoratorexample;

public class AutoElectricoDecorado extends AutomovilDecorador{

    public AutoElectricoDecorado(Automovil auto) {
        super(auto);
    }

    @Override
    public void arrancar(){
        getAuto().arrancar();
        System.out.println("Iniciando Sistemas Electricos");

    }

    @Override
    public void apagar() {
        getAuto().apagar();
        System.out.println("Apagando Sistema Operativo");

    }

    @Override
    public void frenar() {
        getAuto().frenar();
        System.out.println("Encendiendo ABS");

    }
}
