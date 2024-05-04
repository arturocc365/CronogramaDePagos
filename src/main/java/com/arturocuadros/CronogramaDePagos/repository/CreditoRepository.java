package com.arturocuadros.CronogramaDePagos.repository;

import com.arturocuadros.CronogramaDePagos.models.Creditos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditoRepository extends JpaRepository<Creditos, Long> {
}
