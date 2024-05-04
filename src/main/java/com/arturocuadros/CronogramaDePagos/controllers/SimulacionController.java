package com.arturocuadros.CronogramaDePagos.controllers;

import com.arturocuadros.CronogramaDePagos.models.Simulaciones;
import com.arturocuadros.CronogramaDePagos.service.impl.SimulacioneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController
public class SimulacionController {
    /*private final SimulacioneService simulacionService;

    public SimulacionController(SimulacioneService simulacionService) {
        this.simulacionService = simulacionService;
    }

    @PostMapping
    public ResponseEntity<Simulaciones> registrarSimulacion(@RequestBody Simulaciones simulacion) {
        Simulaciones nuevaSimulacion = simulacionService.registrarSimulacion(simulacion);
        return ResponseEntity.ok(nuevaSimulacion);
    }

    @GetMapping
    public ResponseEntity<List<Simulaciones>> obtenerTodasLasSimulaciones() {
        List<Simulaciones> simulaciones = simulacionService.obtenerTodasLasSimulaciones();
        return ResponseEntity.ok(simulaciones);
    }*/
}
