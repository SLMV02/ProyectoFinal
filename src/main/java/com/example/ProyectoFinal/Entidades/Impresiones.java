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
@Table(name = "impresiones")
public class Impresiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private int numeroCopias;

    private double precio;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuarios usuario;

    public Impresiones() {
    }

    public Impresiones(Long id, LocalDate fecha, int numeroCopias, double precio, Usuarios usuario) {
        this.id = id;
        this.fecha = fecha;
        this.numeroCopias = numeroCopias;
        this.precio = precio;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNumeroCopias() {
        return numeroCopias;
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

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

}
