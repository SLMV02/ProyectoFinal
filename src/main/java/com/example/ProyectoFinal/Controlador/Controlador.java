package com.example.ProyectoFinal.Controlador;

import com.example.ProyectoFinal.Entidades.Ventas;
import com.example.ProyectoFinal.Servicios.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controlador {

    @RestController
    @RequestMapping("/ventas")
    public class VentaController {

        @Autowired
        private Servicios ventasServicio;

        @GetMapping("/obtenerVentas")
        public List<Ventas> obtenerVentas() {
            return ventasServicio.obtenerTodasLasVentas();
        }
        
        @PostMapping
        public Ventas registrarVenta(@RequestBody Ventas ventas) {
            return ventasServicio.guardarVentas(ventas);
        }
    }
}
