package com.horarios.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurnoDTO {
    private Long id;
    @NotEmpty(message = "el nombre no puede estar vacio")
    private String name;
    @NotNull(message = "la hora de inicio no puede estar vacia")
    private LocalTime startTime;
    @NotNull(message = "la hora de fin no puede estar vacia")
    private LocalTime endTime;
    private int durationMinutes;
    private int intervalMinutes;
    private int toleranceMinutes;
    private int dailyWorkHours;
    private int weeklyWorkHours;
    private int monthlyWorkHours;
    private int monthlyLateHours;
    private int monthlyExtraHours;
}
