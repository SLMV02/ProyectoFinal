package com.example.ProyectoFinal.Controlador;

import com.example.ProyectoFinal.Entidades.Ventas;
import com.example.ProyectoFinal.Servicios.VentasServicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ventas")
public class VentasControlador {

    @Autowired
    private VentasServicios vServicio;

    @GetMapping("/listarVentas")
    public ResponseEntity<List<Ventas>> listarVentas() {
        return ResponseEntity.ok(vServicio.listarVentas());
    }
    
    @PostMapping("/registrarVentas")
    public ResponseEntity<Ventas> registrarVenta(@RequestBody Ventas ventas) {
        return ResponseEntity.ok(vServicio.registrarVentas(ventas));
    }
}

