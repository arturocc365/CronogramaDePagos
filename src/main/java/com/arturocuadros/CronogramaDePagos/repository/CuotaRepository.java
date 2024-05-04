package com.arturocuadros.CronogramaDePagos.repository;

import com.arturocuadros.CronogramaDePagos.models.Cuotas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuotaRepository extends JpaRepository<Cuotas, Long> {
}
