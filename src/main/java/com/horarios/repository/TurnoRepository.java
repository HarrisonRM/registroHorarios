
package com.horarios.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.horarios.model.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {
}