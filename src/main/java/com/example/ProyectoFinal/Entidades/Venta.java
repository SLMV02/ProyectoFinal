package com.example.ProyectoFinal.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private String productoOServicio;

    private int cantidad;

    private double precioUnitario;

    private double precioTotal;

    public Venta() {
    }

    public Venta(LocalDate fecha, String productoOServicio, int cantidad, double precioUnitario) {
        this.fecha = fecha;
        this.productoOServicio = productoOServicio;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = cantidad * precioUnitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getProductoOServicio() {
        return productoOServicio;
    }

    public void setProductoOServicio(String productoOServicio) {
        this.productoOServicio = productoOServicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.precioTotal = this.precioUnitario * cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.precioTotal = this.precioUnitario * this.cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }
}
