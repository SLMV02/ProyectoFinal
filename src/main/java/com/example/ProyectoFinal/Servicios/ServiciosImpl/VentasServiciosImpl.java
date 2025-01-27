
package com.example.ProyectoFinal.Servicios.ServiciosImpl;

import com.example.ProyectoFinal.Entidades.Ventas;
import com.example.ProyectoFinal.Repositorio.VentasRepositorio;
import com.example.ProyectoFinal.Servicios.VentasServicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentasServiciosImpl implements VentasServicios { 

    @Autowired
    private VentasRepositorio ventasRepositorio;

    @Override
    public Ventas registrarVentas(Ventas ventas) {
        return ventasRepositorio.save(ventas);
    }

    @Override
    public List<Ventas> listarVentas() {
        return ventasRepositorio.findAll();
    }
}
    

