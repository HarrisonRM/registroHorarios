package com.horarios.services;

import java.util.List;

import com.horarios.model.RegistroHorario;

public interface RegistroService {

      List<RegistroHorario> obtenerTodos();
     RegistroHorario crearRegistroHorario(RegistroHorario RegistroHorario);
    RegistroHorario buscarPorNombre(String nombre);
    
}
