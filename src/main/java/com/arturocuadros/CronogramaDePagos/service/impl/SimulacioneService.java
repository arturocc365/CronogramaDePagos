package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Simulaciones;
import com.arturocuadros.CronogramaDePagos.service.ISimulacioneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulacioneService implements ISimulacioneService {
    @Override
    public Simulaciones registrarSimulacion(Simulaciones simulacion) {
        return null;
    }

    @Override
    public List<Simulaciones> obtenerTodasLasSimulaciones() {
        return List.of();
    }
}
