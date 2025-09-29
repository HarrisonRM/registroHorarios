package com.horarios.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroHorarioDTO {
    private Long id;
    @NotNull(message = "el id del turno no puede estar vacio")
    private Long turnoId;
    @NotEmpty(message = "el nombre no puede estar vacio")
    private String name;
    @NotNull(message = "la fecha no puede estar vacia")
    private LocalDate date;
    @NotNull(message = "la hora de entrada no puede estar vacia")
    private LocalTime timeIn;
    private LocalTime timeOut;
    @NotEmpty(message = "el tipo no puede estar vacio")
    private String type;
    @NotEmpty(message = "el empleado no puede estar vacio")
    private String employee;
}
