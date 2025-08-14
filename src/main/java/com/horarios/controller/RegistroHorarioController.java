// controller/RegistroHorarioController.java
package com.horarios.controller;

import com.horarios.horarios.modulo.RegistroHorario;
import com.horarios.horarios.repository.RegistroHorarioRepository;
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
}

