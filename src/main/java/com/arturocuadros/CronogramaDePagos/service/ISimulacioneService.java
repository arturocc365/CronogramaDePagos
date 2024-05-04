package com.arturocuadros.CronogramaDePagos.service;

import com.arturocuadros.CronogramaDePagos.models.Simulaciones;

import java.util.List;

public interface ISimulacioneService {
    Simulaciones registrarSimulacion(Simulaciones simulacion);
    List<Simulaciones> obtenerTodasLasSimulaciones();
}
