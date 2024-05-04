package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Cuotas;
import com.arturocuadros.CronogramaDePagos.service.ICuotaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuotaService implements ICuotaService {
    @Override
    public List<Cuotas> generarCronogramaDePagos(Long creditoId) {
        return List.of();
    }
}
