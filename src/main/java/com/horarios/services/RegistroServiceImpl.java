package com.horarios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horarios.model.RegistroHorario;
import com.horarios.repository.RegistroHorarioRepository;

@Service
public class RegistroServiceImpl implements RegistroService {

    @Autowired
    private RegistroHorarioRepository registroHorarioRepository;

    @Override
    public List<RegistroHorario> obtenerTodos() {
        return registroHorarioRepository.findAll();
    }

    @Override
    public RegistroHorario crearRegistroHorario(RegistroHorario registroHorario) {
        if (registroHorario == null) {
            throw new IllegalArgumentException("El registro no puede ser nulo");
        }
        if (registroHorario.getName() == null || registroHorario.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (registroHorario.getDate() == null) {
            throw new IllegalArgumentException("La fecha es obligatoria");
        }
        if (registroHorario.getTimeIn() == null) {
            throw new IllegalArgumentException("La hora de entrada es obligatoria");
        }
        if (registroHorario.getType() == null ||
                ! (registroHorario.getType().equalsIgnoreCase("entrada") || registroHorario.getType().equalsIgnoreCase("salida"))) {
            throw new IllegalArgumentException("El tipo debe ser 'entrada' o 'salida'");
        }
        if (registroHorario.getEmployee() == null || registroHorario.getEmployee().trim().isEmpty()) {
            throw new IllegalArgumentException("El empleado es obligatorio");
        }
        return registroHorarioRepository.save(registroHorario);
    }

    @Override
    public RegistroHorario buscarPorNombre(String nombre) {
        return registroHorarioRepository.findByName(nombre);
    }
}
