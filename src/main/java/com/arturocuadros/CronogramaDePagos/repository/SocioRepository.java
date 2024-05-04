package com.arturocuadros.CronogramaDePagos.repository;

import com.arturocuadros.CronogramaDePagos.models.Socios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocioRepository extends JpaRepository<Socios, Long> {
}
