/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiago.crud.Repository;

import com.santiago.crud.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jhona
 */
@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer>{
    
}
