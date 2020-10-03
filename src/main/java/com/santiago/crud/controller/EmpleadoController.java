/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santiago.crud.controller;

//import com.santiago.crud.Entity.EmpleadoController;
import com.santiago.crud.Entity.Empleado;
import com.santiago.crud.Service.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jhona
 */
@Controller
public class EmpleadoController {

    private final EmpleadoService empleadorService;

    public EmpleadoController(EmpleadoService empleadorService) {
        this.empleadorService = empleadorService;
    }
    
    
    @GetMapping("/")
    public String listar(Model model) {
        List<Empleado> lista = empleadorService.listar();
        model.addAttribute("empleados", lista);
        return "index";
    }
    @GetMapping("/formulario")
    public String nuevo(Model model) {
        model.addAttribute("empleado",new Empleado());
        return "empleado/formulario";
    }
    @PostMapping("/guardar")
    public String guardar(Empleado empleado,Model model){
        empleadorService.guardar(empleado);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id,Model model){
         Optional<Empleado> empleado = empleadorService.datosPorId(id);
         model.addAttribute("empleado", empleado);
         return "empleado/formulario";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id){
        empleadorService.eliminar(id);
        return "redirect:/";
    }
}
