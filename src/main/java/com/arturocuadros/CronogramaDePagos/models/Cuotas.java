package com.arturocuadros.CronogramaDePagos.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "cuota")
public class Cuotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_credito")
    private Long id;

    @Column(name = "numero_cuota")
    private Long numeroCuota;

    @Column(name = "saldo_inicial")
    private BigDecimal saldoInicial;

    @Column(name = "amortizacion")
    private BigDecimal amortizacion;

    @Column(name = "interes")
    private BigDecimal interes;

    @Column(name = "seguro")
    private BigDecimal seguro;

    @Column(name = "monto_cuota")
    private BigDecimal montoCuota;

    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimiento;

    @Column(name = "estado")
    private int estado;

    @Column(name = "fecha_crea")
    private LocalDate fechaCrea;

    @Column(name = "usuario_crea", length = 15)
    private String usuarioCrea;

    @Column(name = "flag")
    private byte flag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Long numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public BigDecimal getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(BigDecimal amortizacion) {
        this.amortizacion = amortizacion;
    }

    public BigDecimal getInteres() {
        return interes;
    }

    public void setInteres(BigDecimal interes) {
        this.interes = interes;
    }

    public BigDecimal getSeguro() {
        return seguro;
    }

    public void setSeguro(BigDecimal seguro) {
        this.seguro = seguro;
    }

    public BigDecimal getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(BigDecimal montoCuota) {
        this.montoCuota = montoCuota;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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

    public byte getFlag() {
        return flag;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }
}
