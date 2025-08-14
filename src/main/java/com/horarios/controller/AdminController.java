package com.horarios.controller;

import com.horarios.modelo.Admin;
import com.horarios.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private AdminRepository AdminRepository;

    @GetMapping
    public List<Admin> obtenerTodos() {
        return AdminRepository.findAll();
    }

    @PostMapping
    public Admin crearAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }
}
java
Copiar
Editar

