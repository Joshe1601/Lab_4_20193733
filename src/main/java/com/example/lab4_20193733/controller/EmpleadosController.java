package com.example.lab4_20193733.controller;


import com.example.lab4_20193733.entity.Empleados;
import com.example.lab4_20193733.repository.EmpleadosRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmpleadosController {

    final EmpleadosRepository empleadosRepository;

    public EmpleadosController(EmpleadosRepository empleadosRepository) {
        this.empleadosRepository = empleadosRepository;
    }

    @GetMapping(value = {"/","/empleados"})
    public String principalEmpleados(Model model) {

        List<Empleados> listaEmpleados = empleadosRepository.findAll();

        model.addAttribute("listaEmpleados", listaEmpleados);

        return "empleados/principal-empleados";
    }

    @PostMapping(value = "/buscarEmpleado")
    public String buscarEmpleado(Model model, @RequestParam("search") String search) {

        List<Empleados> listaEmpleados = empleadosRepository.findByName(search, search);

        model.addAttribute("listaEmpleados", listaEmpleados);

        return "empleados/principal-empleados";
    }



}
