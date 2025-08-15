package com.horarios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horarios.modelo.RegistroHorario;
import com.horarios.repository.RegistroHorarioRepository;

@Service
public class RegistroServicelmpl implements RegistroService{


     @Autowired
    private RegistroHorarioRepository RegistroHorarioRepository;

    @Override
    public List<RegistroHorario> obtenerTodos() {
       return RegistroHorarioRepository.findAll();
    }

    @Override
    public RegistroHorario crearRegistroHorario(RegistroHorario RegistroHorario) {
          return RegistroHorarioRepository.save(RegistroHorario);

    }

    @Override
  public RegistroHorario buscarPorNombre(String nombre) {
        return RegistroHorarioRepository.findByName(nombre);
    
}
}
