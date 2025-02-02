package com.example.ProyectoFinal.Controlador;

import com.example.ProyectoFinal.Entidades.Venta;
import com.example.ProyectoFinal.Servicios.VentaServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ventas")
public class VentaControlador {

    private final VentaServicio ventaServicio;

    @Autowired
    public VentaControlador(VentaServicio ventaServicio) {
        this.ventaServicio = ventaServicio;
    }

    @PostMapping("/crearVenta")
    public Venta crearVenta(@RequestBody Venta venta) {
        return ventaServicio.guardarVenta(venta);
    }

    @GetMapping("/ventas")
    public List<Venta> obtenerTodasLasVentas() {
        return ventaServicio.obtenerTodasLasVentas();
    }

    @GetMapping("/{id}")
    public Optional<Venta> obtenerVentaPorId(@PathVariable Long id) {
        return ventaServicio.obtenerVentaPorId(id);
    }

    @PutMapping("/{id}")
    public Venta actualizarVenta(@PathVariable Long id, @RequestBody Venta detallesVenta) {
        return ventaServicio.obtenerVentaPorId(id).map(venta -> {
            venta.setFecha(detallesVenta.getFecha());
            venta.setProductoOServicio(detallesVenta.getProductoOServicio());
            venta.setCantidad(detallesVenta.getCantidad());
            venta.setPrecioUnitario(detallesVenta.getPrecioUnitario());
            return ventaServicio.guardarVenta(venta);
        }).orElseThrow(() -> new RuntimeException("Venta no encontrada"));
    }

    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable Long id) {
        ventaServicio.eliminarVenta(id);
        return "Venta eliminada con éxito";
    }
}
