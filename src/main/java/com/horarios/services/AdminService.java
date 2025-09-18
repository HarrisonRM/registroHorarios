package com.horarios.services;

import com.horarios.model.Admin;
import com.horarios.model.RegistroHorario;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    List<RegistroHorario> obtenerTodos();
    Optional<Admin> getAdminById(Long id);
    Admin createAdmin(Admin admin);
    Admin updateAdmin(Long id, Admin adminDetails);
    void deleteAdmin(Long id);
    List<Admin> getAllAdmins();
}
