package com.horarios.services;

import com.horarios.model.Turno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.horarios.repository.TurnoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoServicelmpl {

    @Autowired
    private TurnoRepository turnoRepository;

    public List<Turno> getAllTurnos() {
        return turnoRepository.findAll();
    }

    public Optional<Turno> getTurnoById(Long id) {
        return turnoRepository.findById(id);
    }

    public Turno createTurno(Turno turno) {
        return turnoRepository.save(turno);
    }

    public Turno updateTurno(Long id, Turno turnoDetails) {
        return turnoRepository.findById(id).map(turno -> {
            if (turnoDetails.getName() != null) {
                turno.setName(turnoDetails.getName());
            }
            if (turnoDetails.getStartTime() != null) {
                turno.setStartTime(turnoDetails.getStartTime());
            }
            if (turnoDetails.getEndTime() != null) {
                turno.setEndTime(turnoDetails.getEndTime());
            }
            // Agrega más campos según tu entidad Turno
            return turnoRepository.save(turno);
        }).orElseThrow(() -> new RuntimeException("Turno no encontrado con id: " + id));
    }

    public void deleteTurno(Long id) {
        if (!turnoRepository.existsById(id)) {
            throw new RuntimeException("Turno no encontrado con id: " + id);
        }
        turnoRepository.deleteById(id);
    }
}
