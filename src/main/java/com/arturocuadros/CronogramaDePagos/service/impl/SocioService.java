package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Socios;
import com.arturocuadros.CronogramaDePagos.repository.SocioRepository;
import com.arturocuadros.CronogramaDePagos.service.ISocioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocioService implements ISocioService {
    private final SocioRepository socioRepository;

    public SocioService(SocioRepository socioRepository) {
        this.socioRepository = socioRepository;
    }

    @Override
    public Socios registrarSocio(Socios socio) {
        return socioRepository.save(socio);
    }

    @Override
    public List<Socios> obtenerTodosLosSocios() {
        return socioRepository.findAll();
    }
}
