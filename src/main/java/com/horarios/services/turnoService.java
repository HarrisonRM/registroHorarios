package com.horarios.services;

import com.horarios.model.Turno;
import java.util.List;
import java.util.Optional;

public interface turnoService {

    Turno createTurno(Turno turno);

    Optional<Turno> getTurnoById(Long id);

    List<Turno> getAllTurnos();

    Turno updateTurno(Long id, Turno turnoDetails);

    void deleteTurno(Long id);
}