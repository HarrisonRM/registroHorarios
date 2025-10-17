package com.horarios.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AdminDTO extends EmpleadoDTO {
    @NotEmpty(message = "los privilegios no pueden estar vacios")
    private String privileges;
    @NotEmpty(message = "el nivel de acceso no puede estar vacio")
    private String accessLevel;
    @NotEmpty(message = "el departamento no puede estar vacio")
    private String department;
    @NotEmpty(message = "el puesto no puede estar vacio")
    private String position;
    @NotEmpty(message = "la contraseña no puede estar vacia")
    private String password;
    private String phone;
    @NotEmpty(message = "el email no puede estar vacio")
    private String email;
}
