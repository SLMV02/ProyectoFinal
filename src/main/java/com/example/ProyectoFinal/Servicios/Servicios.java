package com.example.ProyectoFinal.Servicios;

import com.example.ProyectoFinal.Entidades.Ventas;
import com.example.ProyectoFinal.Repositorio.Repositorio.VentasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicios {

    @Autowired
    private VentasRepository ventasRepositorio;

    public Ventas guardarVentas(Ventas venta) {
        return ventasRepositorio.save(venta);
    }

    public List<Ventas> obtenerTodasLasVentas() {
        return ventasRepositorio.findAll();
    }
}
