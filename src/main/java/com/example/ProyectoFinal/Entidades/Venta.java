
package com.example.ProyectoFinal.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "ventas")
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private String producto;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuarios usuario;

    public Ventas() {
    }

    public Ventas(Long id, LocalDate fecha, String producto, double precio, Usuarios usuario) {
        this.id = id;
        this.fecha = fecha;
        this.producto = producto;
        this.precio = precio;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

 
}

