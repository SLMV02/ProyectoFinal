
package com.example.ProyectoFinal.Repositorio;

import com.example.ProyectoFinal.Entidades.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentasRepositorio extends JpaRepository<Ventas, Long> {
}