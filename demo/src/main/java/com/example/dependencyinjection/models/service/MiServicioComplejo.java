package com.example.dependencyinjection.models.service;



//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {
    public String operacion() {

        return "Ejecutando algun proceso importante complejo..... ";
    }

}
