package com.arturocuadros.CronogramaDePagos.repository;

import com.arturocuadros.CronogramaDePagos.models.Seguros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguroRepository extends JpaRepository<Seguros, Long> {
}
