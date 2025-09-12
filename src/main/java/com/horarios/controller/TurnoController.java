package com.horarios.controller;

import com.horarios.model.Turno;
import com.horarios.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/turnos")
@CrossOrigin(origins = "*")
public class TurnoController {

    @Autowired
    private TurnoRepository turnoRepository;

    @GetMapping
    public List<Turno> obtenerTodos() {
        return turnoRepository.findAll();
    }

    @PostMapping
    public Turno crearTurno(@RequestBody Turno turno) {
        return turnoRepository.save(turno);
    }
}
