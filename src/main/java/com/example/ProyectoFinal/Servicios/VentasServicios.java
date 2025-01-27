
package com.example.ProyectoFinal.Servicios;

import com.example.ProyectoFinal.Entidades.Ventas;
import java.util.List;


public interface VentasServicios {
    Ventas registrarVentas(Ventas ventas);
    List<Ventas> listarVentas();
}

