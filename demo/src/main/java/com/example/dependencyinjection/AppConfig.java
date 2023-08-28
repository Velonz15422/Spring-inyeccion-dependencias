package com.example.dependencyinjection;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.dependencyinjection.models.service.IServicio;
import com.example.dependencyinjection.models.service.MiServicio;
import com.example.dependencyinjection.models.service.MiServicioComplejo;
import com.example.dependencyinjection.models.service.domain.ItemFactura;
import com.example.dependencyinjection.models.service.domain.Producto;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    public IServicio registrarMIServicio() {
        return new MiServicio();

    }

    @Bean("miServicioComplejo")
    @Primary
    public IServicio registrarMIServicioComplejo() {
        return new MiServicioComplejo();

    }

    @Bean("itemsFctura")
    public List<ItemFactura> registrarItems() {
        Producto producto1 = new Producto("camara sony", 1200);
        Producto producto2 = new Producto("Bicicleta", 400);

        ItemFactura linea1 = new ItemFactura(producto1, 3);

        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina() {
        Producto producto3 = new Producto("Monitor LG", 600);
        Producto producto4 = new Producto("Laptop asus", 2000);

        ItemFactura linea3 = new ItemFactura(producto3, 3);

        ItemFactura linea4 = new ItemFactura(producto4, 4);

        return Arrays.asList(linea3, linea4);
    }

}
