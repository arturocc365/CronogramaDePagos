package com.arturocuadros.CronogramaDePagos.controllers;

import com.arturocuadros.CronogramaDePagos.models.Seguros;
import com.arturocuadros.CronogramaDePagos.service.impl.SeguroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController
public class SeguroController {
    /*private final SeguroService seguroService;

    public SeguroController(SeguroService seguroService) {
        this.seguroService = seguroService;
    }

    @PostMapping
    public ResponseEntity<Seguros> crearSeguro(@RequestBody Seguros seguro) {
        Seguros nuevoSeguro = seguroService.crearSeguro(seguro);
        return ResponseEntity.ok(nuevoSeguro);
    }

    @GetMapping
    public ResponseEntity<List<Seguros>> obtenerTodosLosSeguros() {
        List<Seguros> seguros = seguroService.obtenerTodosLosSeguros();
        return ResponseEntity.ok(seguros);
    }*/
}
