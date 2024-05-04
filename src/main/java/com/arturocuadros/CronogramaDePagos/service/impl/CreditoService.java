package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Creditos;
import com.arturocuadros.CronogramaDePagos.repository.CreditoRepository;
import com.arturocuadros.CronogramaDePagos.service.ICreditoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditoService implements ICreditoService {
    private final CreditoRepository creditoRepository;

    public CreditoService(CreditoRepository creditoRepository) {
        this.creditoRepository = creditoRepository;
    }

    @Override
    public Creditos registrarCredito(Creditos credito) {
        return creditoRepository.save(credito);
    }

    @Override
    public List<Creditos> obtenerTodosLosCreditos() {
        // return List.of();
        return creditoRepository.findAll();
    }
}
