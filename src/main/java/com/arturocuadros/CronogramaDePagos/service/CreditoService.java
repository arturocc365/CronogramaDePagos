package com.arturocuadros.CronogramaDePagos.service;

import com.arturocuadros.CronogramaDePagos.models.Creditos;

import java.util.List;

public interface CreditoService {
    Creditos registrarCredito(Creditos credito);
    List<Creditos> obtenerTodosLosCreditos();
}
