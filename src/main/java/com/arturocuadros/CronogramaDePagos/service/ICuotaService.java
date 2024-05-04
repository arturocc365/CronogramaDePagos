package com.arturocuadros.CronogramaDePagos.service;

import com.arturocuadros.CronogramaDePagos.models.Cuotas;

import java.util.List;

public interface ICuotaService {
    List<Cuotas> generarCronogramaDePagos(Long creditoId);
}
