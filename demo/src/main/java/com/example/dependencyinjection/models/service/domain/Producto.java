package com.example.dependencyinjection.models.service.domain;


public class Producto {
    private String nombre;
    private Integer precio;


    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }



    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

}
