package com.example.facade_example;

public class FacadeViajes {

    private HotelApi hotelApi;
    private VuelosApi vuelosApi;

    public FacadeViajes() {
        this.hotelApi = new HotelApi();
        this.vuelosApi = new VuelosApi();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        vuelosApi.buscaVuelos(fechaIda,fechaVuelta,origen,destino);
        hotelApi.buscaHoteles(fechaIda,fechaVuelta,destino);
    }

}
