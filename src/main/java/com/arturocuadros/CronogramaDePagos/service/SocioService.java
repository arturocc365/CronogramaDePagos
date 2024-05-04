package com.arturocuadros.CronogramaDePagos.service;

import com.arturocuadros.CronogramaDePagos.models.Socios;

import java.util.List;

public interface SocioService {
    Socios registrarSocio(Socios socio);
    List<Socios> obtenerTodosLosSocios();
}
