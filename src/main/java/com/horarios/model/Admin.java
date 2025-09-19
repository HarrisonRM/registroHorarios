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

}
