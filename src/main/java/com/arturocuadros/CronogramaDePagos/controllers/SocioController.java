package com.arturocuadros.CronogramaDePagos.controllers;


import com.arturocuadros.CronogramaDePagos.models.Socios;
import com.arturocuadros.CronogramaDePagos.service.impl.SocioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController
public class SocioController {
    /*private final SocioService socioService;

    public SocioController(SocioService socioService) {
        this.socioService = socioService;
    }

    @PostMapping
    public ResponseEntity<Socios> registrarSocio(@RequestBody Socios socio) {
        Socios nuevoSocio = socioService.registrarSocio(socio);
        return ResponseEntity.ok(nuevoSocio);
    }

    @GetMapping
    public ResponseEntity<List<Socios>> obtenerTodosLosSocios() {
        List<Socios> socios = socioService.obtenerTodosLosSocios();
        return ResponseEntity.ok(socios);
    }*/
}
