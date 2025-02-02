
package com.example.ProyectoFinal.Repositorio;

import com.example.ProyectoFinal.Entidades.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepositorio extends JpaRepository<Venta, Long> {
}
