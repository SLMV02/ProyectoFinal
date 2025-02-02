
package com.example.ProyectoFinal.Servicios;

import com.example.ProyectoFinal.Entidades.Venta;
import com.example.ProyectoFinal.Repositorio.VentaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
public class VentaServicio {

    private final VentaRepositorio ventaRepositorio;

    @Autowired
    public VentaServicio(VentaRepositorio ventaRepositorio) {
        this.ventaRepositorio = ventaRepositorio;
    }

    public Venta guardarVenta(Venta venta) {
        return ventaRepositorio.save(venta);
    }

    public List<Venta> obtenerTodasLasVentas() {
        return ventaRepositorio.findAll();
    }

    public Optional<Venta> obtenerVentaPorId(Long id) {
        return ventaRepositorio.findById(id);
    }

    public void eliminarVenta(Long id) {
        ventaRepositorio.deleteById(id);
    }
}

