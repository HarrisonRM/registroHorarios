package com.horarios.controller;
import com.horarios.model.Empleado;
import com.horarios.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin(origins = "*")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping
    public List<Empleado> obtenerTodos() {
        return empleadoRepository.findAll();
    }

    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
    @GetMapping("/{id}")
    public Empleado obtenerEmpleadoPorId(@PathVariable Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }
    @PutMapping("/{id}")
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleadoActualizado) {
        return empleadoRepository.findById(id)
                .map(empleado -> {
                    empleado.setName(empleadoActualizado.getName());
                    empleado.setDocument(empleadoActualizado.getDocument());
                    empleado.setPosition(empleadoActualizado.getPosition());
                    return empleadoRepository.save(empleado);
                })
                .orElse(null);
    }
    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Long id) {
        empleadoRepository.deleteById(id);
    }
}
