package com.horarios.modelo;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends Empleado {
    private String privilegios; // Ej: "GESTION_TURNOS, CREAR_EMPLEADOS"
}