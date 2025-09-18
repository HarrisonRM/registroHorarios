package com.horarios.services;
import com.horarios.model.Empleado;
import com.horarios.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public void deleteEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

    @Override
    public Optional<Empleado> getEmpleadoById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(Long id, Empleado empleadoDetails) {
        return empleadoRepository.findById(id).map(empleado -> {
            empleado.setName(empleadoDetails.getName());
            empleado.setDocument(empleadoDetails.getDocument());
            empleado.setPosition(empleadoDetails.getPosition());
            empleado.setPass(empleadoDetails.getPass());
            return empleadoRepository.save(empleado);
        }).orElse(null);
    }

    @Override
    public List<String> getPrivileges() {
        return null;
    }
}

