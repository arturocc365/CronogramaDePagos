package com.arturocuadros.CronogramaDePagos.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "credito")
public class Creditos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*@Column(name = "id_simulacion")
    private Simulaciones idSimulacion;*/

    @Column(name = "fecha_aprobacion")
    private LocalDate fechaAprobacion;

    @Column(name = "operacion", length = 80)
    private String operacion;

    @Column(name = "monto_solicitado")
    private double montoSolicitado;

    @Column(name = "tea")
    private double tea;

    private int plazo;

    private int estado;

    @Column(name = "fecha_crea")
    private LocalDate fechaCrea;

    @Column(name = "usuario_crea", length = 15)
    private String usuarioCrea;

    @Column(name = "ip", length = 80)
    private String ip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(LocalDate fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public double getTea() {
        return tea;
    }

    public void setTea(double tea) {
        this.tea = tea;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(LocalDate fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public String getUsuarioCrea() {
        return usuarioCrea;
    }

    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
