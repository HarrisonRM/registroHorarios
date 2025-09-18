package com.horarios.services;

import java.util.List;
import java.util.Optional;
import com.horarios.model.Turno;

public interface turnoService {
       
    Optional<Turno> getTurnoById(Long id);
    List<Turno> getAllTurnos();
    Turno updateTurno(Long id, Turno turnoDetails);
    void deleteTurno(Long id);
    Turno createTurno(Turno turno);

}
