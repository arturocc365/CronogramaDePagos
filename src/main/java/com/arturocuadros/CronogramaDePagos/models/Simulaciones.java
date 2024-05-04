package com.arturocuadros.CronogramaDePagos.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Simulacion")
public class Simulaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "entidad_pago")
    private Long entidadPago;

    /*@ManyToOne
    @Column(name = "codigo_socio", length = 14)
    private Socios codigoSocio;

    @ManyToOne
    @Column(name = "id_seguro")
    private Seguros idSeguro;*/

    @Column(name = "remuneracion")
    private double remuneracion;

    @Column(name = "descuento_oficial")
    private double descuentoOficial;

    @Column(name = "descuento_personal")
    private double descuentoPersonal;

    @Column(name = "bonificacion")
    private double bonificacion;

    @Column(name = "monto")
    private double montoCuota;

    @Column(name = "fecha_crea")
    private LocalDate fechaCrea;

    @Column(name = "flag")
    private byte flag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEntidadPago() {
        return entidadPago;
    }

    public void setEntidadPago(Long entidadPago) {
        this.entidadPago = entidadPago;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public double getDescuentoOficial() {
        return descuentoOficial;
    }

    public void setDescuentoOficial(double descuentoOficial) {
        this.descuentoOficial = descuentoOficial;
    }

    public double getDescuentoPersonal() {
        return descuentoPersonal;
    }

    public void setDescuentoPersonal(double descuentoPersonal) {
        this.descuentoPersonal = descuentoPersonal;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public LocalDate getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(LocalDate fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public byte getFlag() {
        return flag;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }
}
