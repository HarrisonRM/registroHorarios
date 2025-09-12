package com.horarios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horarios.model.RegistroHorario;
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
      public RegistroHorario crearRegistroHorario(RegistroHorario registroHorario) {
            if (registroHorario == null) {
                  throw new IllegalArgumentException("El registro no puede ser nulo");
            }
            if (registroHorario.getName() == null || registroHorario.getName().trim().isEmpty()) {
                  throw new IllegalArgumentException("El nombre es obligatorio");
            }
            if (registroHorario.getFecha() == null) {
                  throw new IllegalArgumentException("La fecha es obligatoria");
            }
            if (registroHorario.getHora() == null) {
                  throw new IllegalArgumentException("La hora es obligatoria");
            }
                  if (registroHorario.getTipo() == null ||
                        !(((String)registroHorario.getTipo()).equalsIgnoreCase("entrada") || ((String)registroHorario.getTipo()).equalsIgnoreCase("salida"))) {
                        throw new IllegalArgumentException("El tipo debe ser 'entrada' o 'salida'");
                  }
            if (registroHorario.getEmpleado() == null || registroHorario.getEmpleado().toString().trim().isEmpty()) {
                  throw new IllegalArgumentException("El empleado es obligatorio");
            }
            return RegistroHorarioRepository.save(registroHorario);
      }

      @Override
      public RegistroHorario buscarPorNombre(String nombre) {
            return RegistroHorarioRepository.findByName(nombre);
      }
}