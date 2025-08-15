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
    private AdminRepository adminRepository;

    @GetMapping
    public List<Admin> obtenerTodos() {
        return adminRepository.findAll();
    }

    @PostMapping
    public Admin crearAdmin(@RequestBody Admin nueAdmin) {
        return adminRepository.save(nueAdmin);
    }
}
