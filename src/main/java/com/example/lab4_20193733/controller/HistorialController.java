package com.example.lab4_20193733.controller;


import com.example.lab4_20193733.entity.Historial;
import com.example.lab4_20193733.repository.HistorialRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HistorialController {

    final HistorialRepository historialRepository;

    public HistorialController(HistorialRepository historialRepository) {
        this.historialRepository = historialRepository;
    }

    @GetMapping(value = "/historial")
    public String principalHistorial(Model model) {

        List<Historial> historialTrabajo = historialRepository.findAll();

        model.addAttribute("historialTrabajo", historialTrabajo);
        return "historial/principal-historial";
    }


}
