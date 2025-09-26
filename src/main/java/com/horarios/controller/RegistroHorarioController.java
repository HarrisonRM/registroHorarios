package com.horarios.controller;
import com.horarios.model.RegistroHorario;
import com.horarios.repository.RegistroHorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registros")
@CrossOrigin(origins = "*")
public class RegistroHorarioController {

    @Autowired
    private RegistroHorarioRepository registroRepository;

    @GetMapping
    public List<RegistroHorario> obtenerTodos() {
        return registroRepository.findAll();
    }

    @PostMapping
    public RegistroHorario registrarHorario(@RequestBody RegistroHorario registro) {
        return registroRepository.save(registro);
    }
    @GetMapping("/{id}")
    public RegistroHorario obtenerRegistroPorId(@PathVariable Long id) {
        return registroRepository.findById(id).orElse(null);
    }
    @PutMapping("/{id}")
    public RegistroHorario actualizarRegistro(@PathVariable Long id, @RequestBody RegistroHorario registroActualizado) {
        return registroRepository.findById(id)
                .map(registro -> {
                    registro.setName(registroActualizado.getName());
                    registro.setDate(registroActualizado.getDate());
                    registro.setTimeIn(registroActualizado.getTimeIn());
                    registro.setTimeOut(registroActualizado.getTimeOut());
                    registro.setType(registroActualizado.getType());
                    registro.setEmployee(registroActualizado.getEmployee());
                    registro.setTurno(registroActualizado.getTurno());
                    return registroRepository.save(registro);
                })
                .orElse(null);
    }
    @DeleteMapping("/{id}")
    public void eliminarRegistro(@PathVariable Long id) {
        registroRepository.deleteById(id);
    }
}

