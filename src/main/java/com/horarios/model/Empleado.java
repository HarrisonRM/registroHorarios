package com.horarios.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", length=50, nullable = false)
    private String name;
    @Column(name="documento", length=50, nullable = false, unique = true)
    private String document;
    @Column(name="cargo", length=50, nullable = false)
    private String position;
    @Column(name="password", length=100, nullable = false)
    private String pass;
    
}
