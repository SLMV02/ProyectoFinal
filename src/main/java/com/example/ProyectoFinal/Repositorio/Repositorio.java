
package com.example.ProyectoFinal.Repositorio;

import com.example.ProyectoFinal.Entidades.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface Repositorio {
    
@Repository
public interface VentasRepository extends JpaRepository<Ventas, Long> {
}
}