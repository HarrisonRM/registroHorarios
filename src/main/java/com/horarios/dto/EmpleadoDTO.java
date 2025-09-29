package com.horarios.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDTO {
    private Long id;
    @NotEmpty(message = "el nombre no puede estar vacio")
    private String name;
    @NotEmpty(message = "el documento no puede estar vacio")
    private String document;
    @NotEmpty(message = "la posicion no puede estar vacia")
    private String position;
    @NotEmpty(message = "la contraseña no puede estar vacia")
    @Size(min = 8, message = "la contraseña debe tener al menos 8 caracteres")
    private String password;
    private String phone;
    @NotEmpty(message = "el email no puede estar vacio")
    @Email(message = "debe ser un email valido")
    private String email;
}
