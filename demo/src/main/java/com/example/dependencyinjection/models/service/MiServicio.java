package com.example.dependencyinjection.models.service;



//@Component("miServicioPrincipal")
public class MiServicio implements IServicio {
    public String operacion() {

        return "Ejecutando algun proceso ";
    }

}
