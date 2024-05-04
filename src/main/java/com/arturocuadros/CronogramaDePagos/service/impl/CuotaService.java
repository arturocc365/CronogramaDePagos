package com.arturocuadros.CronogramaDePagos.service.impl;

import com.arturocuadros.CronogramaDePagos.models.Cuotas;
import com.arturocuadros.CronogramaDePagos.repository.CuotaRepository;
import com.arturocuadros.CronogramaDePagos.service.ICuotaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuotaService implements ICuotaService {
    private final CuotaRepository cuotaRepository;

    public CuotaService(CuotaRepository cuotaRepository) {
        this.cuotaRepository = cuotaRepository;
    }

    @Override
    public List<Cuotas> generarCronogramaDePagos(Long creditoId) {
        return cuotaRepository.findAll();
    }
}
