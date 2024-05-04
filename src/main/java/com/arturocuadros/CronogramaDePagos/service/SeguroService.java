package com.arturocuadros.CronogramaDePagos.service;

import com.arturocuadros.CronogramaDePagos.models.Seguros;

import java.util.List;

public interface SeguroService {
    Seguros crearSeguro(Seguros seguro);
    List<Seguros> obtenerTodosLosSeguros();
}
