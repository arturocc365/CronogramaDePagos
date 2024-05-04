package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Simulaciones;
import com.arturocuadros.CronogramaDePagos.repository.SimulacionRepository;
import com.arturocuadros.CronogramaDePagos.service.ISimulacioneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulacioneService implements ISimulacioneService {
    private final SimulacionRepository simulacionRepository;

    public SimulacioneService(SimulacionRepository simulacionRepository) {
        this.simulacionRepository = simulacionRepository;
    }

    @Override
    public Simulaciones registrarSimulacion(Simulaciones simulacion) {
        return simulacionRepository.save(simulacion);
    }

    @Override
    public List<Simulaciones> obtenerTodasLasSimulaciones() {
        return simulacionRepository.findAll();
    }
}
