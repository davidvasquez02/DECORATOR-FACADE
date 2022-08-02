package com.example.facade_example;

public class VuelosApi {

    public void buscaVuelos(String fechaIda, String fechaVuelta, String origen, String destino){
        System.out.println("==== VUELOS ====");
        System.out.println("Encontramos vuelos hacia " + destino + " desde " + origen);
        System.out.println("FECHA IDA: " + fechaIda + " - FECHA VUELTA: " + fechaVuelta);
        System.out.println("================");
    }

}
