package com.horarios.services;
import com.horarios.model.Empleado;
import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    List<Empleado> getAllEmpleados();
    Optional<Empleado> getEmpleadoById(Long id);
    Empleado createEmpleado(Empleado empleado);
    Empleado updateEmpleado(Long id, Empleado empleadoDetails);
    void deleteEmpleado(Long id);
    // Considerar si este método debería ser más específico, como getEmpleadoPrivileges(Long empleadoId)
    List<String> getPrivileges();

}
