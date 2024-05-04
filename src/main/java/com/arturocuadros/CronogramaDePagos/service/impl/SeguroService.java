package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Seguros;
import com.arturocuadros.CronogramaDePagos.repository.SeguroRepository;
import com.arturocuadros.CronogramaDePagos.service.ISeguroService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeguroService implements ISeguroService {
    private final SeguroRepository seguroRepository;

    public SeguroService(SeguroRepository seguroRepository) {
        this.seguroRepository = seguroRepository;
    }

    @Override
    public Seguros crearSeguro(Seguros seguro) {
        return seguroRepository.save(seguro);
    }

    @Override
    public List<Seguros> obtenerTodosLosSeguros() {
        return seguroRepository.findAll();
    }
}
