package com.horarios.services;

import com.horarios.model.Admin;
import com.horarios.model.RegistroHorario;
import com.horarios.repository.AdminRepository;
import com.horarios.repository.RegistroHorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServicelmpl implements AdminService {

    @Autowired
    private RegistroHorarioRepository registroHorarioRepository;

    @Autowired 
    private AdminRepository adminRepository;

    @Override
    public List<RegistroHorario> obtenerTodos() {
        return registroHorarioRepository.findAll();
    }

    @Override
    public Optional<Admin> getAdminById(Long id) {
        return adminRepository.findById(id);
    }

    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Long id, Admin adminDetails) {
        return adminRepository.findById(id).map(admin -> {
            admin.setName(adminDetails.getName());
            admin.setDocument(adminDetails.getDocument());
            admin.setPosition(adminDetails.getPosition());
            admin.setPass(adminDetails.getPass());
            admin.setPrivileges(adminDetails.getPrivileges());
            return adminRepository.save(admin);
        }).orElseThrow(() -> new RuntimeException("Admin no encontrado con id: " + id));
    }

    @Override
    public void deleteAdmin(Long id) {
        if (!adminRepository.existsById(id)) {
            throw new RuntimeException("Admin no encontrado con id: " + id);
        }
        adminRepository.deleteById(id);
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
}
