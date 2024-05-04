package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Creditos;
import com.arturocuadros.CronogramaDePagos.service.ICreditoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditoService implements ICreditoService {
    @Override
    public Creditos registrarCredito(Creditos credito) {
        return null;
    }

    @Override
    public List<Creditos> obtenerTodosLosCreditos() {
        return List.of();
    }
}
