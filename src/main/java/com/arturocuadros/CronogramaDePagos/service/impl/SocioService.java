package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Socios;
import com.arturocuadros.CronogramaDePagos.service.ISocioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocioService implements ISocioService {
    @Override
    public Socios registrarSocio(Socios socio) {
        return null;
    }

    @Override
    public List<Socios> obtenerTodosLosSocios() {
        return List.of();
    }
}
