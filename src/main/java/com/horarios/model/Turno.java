package com.horarios.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Turno")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // private String nombre;
    // private LocalTime horaInicio;
    // private LocalTime horaFin;
    // private int duracionMinutos;
    // private int intervaloMinutos;
    // private int toleranciaMinutos;
    // private int horasTrabajoDiarias;
    // private int horasTrabajoSemanales;
    // private int horasTrabajoMensuales;
    // private int horasTardesMensuales;
    // private int horasExtrasMensuales;

    @OneToMany(mappedBy = "turno", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RegistroHorario> registros = new ArrayList<>();

    @Column(name = "nombre", length = 50, nullable = false)
    private String name;
    
    @Column(name = "hora_inicio", length = 50, nullable = false)
    private LocalTime startTime;

    @Column(name = "hora_fin", length = 50, nullable = false)
    private LocalTime endTime;

    @Column(name = "duracion_minutos", nullable = false)
    private int durationMinutes;

    @Column(name = "intervalo_minutos", nullable = false)
    private int intervalMinutes;

    @Column(name = "tolerancia_minutos", nullable = false)
    private int toleranceMinutes;

    @Column(name = "horas_trabajo_diarias", nullable = false)
    private int dailyWorkHours;

    @Column(name = "horas_trabajo_semanales", nullable = false)
    private int weeklyWorkHours;

    @Column(name = "horas_trabajo_mensuales", nullable = false)
    private int monthlyWorkHours;

    @Column(name = "horas_tardes_mensuales", nullable = false)
    private int monthlyLateHours;

    @Column(name = "horas_extras_mensuales", nullable = false)
    private int monthlyExtraHours;
}