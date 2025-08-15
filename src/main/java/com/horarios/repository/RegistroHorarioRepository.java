package com.horarios.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.horarios.modelo.RegistroHorario;

@Repository
public interface RegistroHorarioRepository extends JpaRepository<RegistroHorario, Long> {

	RegistroHorario findByName(String nombre);

	
} 
