package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Seguros;
import com.arturocuadros.CronogramaDePagos.service.ISeguroService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeguroService implements ISeguroService {
    @Override
    public Seguros crearSeguro(Seguros seguro) {
        return null;
    }

    @Override
    public List<Seguros> obtenerTodosLosSeguros() {
        return List.of();
    }
}
