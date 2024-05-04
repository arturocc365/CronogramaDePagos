package com.arturocuadros.CronogramaDePagos.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "socio")
public class Socios {
    @Id
    @Column(name = "codigo", length = 14)
    private String codigo;

    @Column(name = "ape_paterno", length = 60)
    private String apePaterno;

    @Column(name = "ape_materno", length = 60)
    private String apeMaterno;

    @Column(name = "nombres", length = 60)
    private String nombres;

    @Column(name = "nombres_completos", length = 180)
    private String nombresCompletos;

    @Column(name = "tipo_documento")
    private int tipoDocumento;

    @Column(name = "numero_documento", length = 15)
    private String numeroDocumento;

    @Column(name = "correo", length = 180)
    private String correo;

    @Column(name = "usuario_crea", length = 15)
    private String usuarioCrea;

    @Column(name = "fecha_crea")
    private LocalDate fechaCrea;

    @Column(name = "flag")
    private byte flag;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombresCompletos() {
        return nombresCompletos;
    }

    public void setNombresCompletos(String nombresCompletos) {
        this.nombresCompletos = nombresCompletos;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuarioCrea() {
        return usuarioCrea;
    }

    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
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
