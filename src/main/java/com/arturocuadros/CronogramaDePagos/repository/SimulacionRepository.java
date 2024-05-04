package com.arturocuadros.CronogramaDePagos.repository;

import com.arturocuadros.CronogramaDePagos.models.Simulaciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimulacionRepository extends JpaRepository<Simulaciones, Long>{
}
