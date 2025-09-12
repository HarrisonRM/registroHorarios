package com.horarios.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RegistroHorario")
public class RegistroHorario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // private String nombre;
    // private LocalDate fecha;
    // private LocalTime horaEntrada;
    // private LocalTime horaSalida;
    // private String tipo; // "entrada" o "salida"
    // private String empleado;
    // private Long turnoId;

    @ManyToOne
    @JoinColumn(name = "turno_id", nullable = false)
    private Turno turno;

   @Column(name="name", length=50, nullable = false, unique = true)
   private String name;

   @Column(name="fecha", length=50, nullable = false)
   private LocalDate date;

   @Column(name="hora_entrada", length=50, nullable = false)
   private LocalTime timeIn;

   @Column(name="hora_salida", length=50, nullable = false)
   private LocalTime timeOut;

   @Column(name="tipo", length=50, nullable = false)
   private String type; 

   @Column(name="empleado", length=50, nullable = false)
   private String employee;

   @ManyToOne
   @JoinColumn(name = "turno_id", nullable = false)
   private Turno shift;

}