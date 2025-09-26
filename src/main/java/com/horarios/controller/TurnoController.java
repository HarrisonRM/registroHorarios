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
    @GetMapping("/{id}")
    public Turno obtenerTurnoPorId(@PathVariable Long id) {
        return turnoRepository.findById(id).orElse(null);
    }
    @PutMapping("/{id}")
    public Turno actualizarTurno(@PathVariable Long id, @RequestBody Turno turnoActualizado) {
        return turnoRepository.findById(id)
                .map(turno -> {
                    turno.setName(turnoActualizado.getName());
                    turno.setStartTime(turnoActualizado.getStartTime());
                    turno.setEndTime(turnoActualizado.getEndTime());
                    return turnoRepository.save(turno);
                })
                .orElse(null);
    }
    @DeleteMapping("/{id}")
    public void eliminarTurno(@PathVariable Long id) {
        turnoRepository.deleteById(id);
    }
}
