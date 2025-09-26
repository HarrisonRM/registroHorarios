package com.horarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends Empleado {

    @Column(name="privilegios", length=100, nullable = false)
    private String privileges;

    @Column(name="nivel_acceso", length=50, nullable = false)
    private String accessLevel;

    @Column(name="telefono", length=15, nullable = false)   
    private String phone;

    @Column(name="email", length=100, nullable = false)   
    private String email;

    @Column(name="contrasena", length=100, nullable = false)   
    private String password;
}
