package com.arturocuadros.CronogramaDePagos.controllers;

import com.arturocuadros.CronogramaDePagos.models.Cuotas;
import com.arturocuadros.CronogramaDePagos.repository.CuotaRepository;
import com.arturocuadros.CronogramaDePagos.service.impl.CuotaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController
public class CuotaController {
    /*private final CuotaService cuotaService;

    public CuotaController(CuotaService cuotaService) {
        this.cuotaService = cuotaService;
    }

    @GetMapping("/cronograma/{creditoId}")
    public ResponseEntity<List<Cuotas>> generarCronogramaDePagos(@PathVariable Long creditoId) {
        List<Cuotas> cronograma = cuotaService.generarCronogramaDePagos(creditoId);
        return ResponseEntity.ok(cronograma);
    }*/
}
