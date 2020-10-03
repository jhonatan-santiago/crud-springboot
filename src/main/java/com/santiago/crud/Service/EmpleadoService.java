/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiago.crud.Service;

import com.santiago.crud.Entity.Empleado;
import com.santiago.crud.Repository.EmpleadoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jhona
 */
@Service
public class EmpleadoService {
    
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
    
    public Empleado guardar(Empleado empleado){
        return empleadoRepository.save(empleado);
    }
    
    public List<Empleado> listar(){
        return (List<Empleado>) empleadoRepository.findAll();
    }
    public void eliminar(int id){
        empleadoRepository.deleteById(id);
    }
    public Optional<Empleado> datosPorId(int id){
        return empleadoRepository.findById(id);
    }
}
