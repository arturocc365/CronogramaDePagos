package com.arturocuadros.CronogramaDePagos.models;

import jakarta.persistence.*;

@Entity
@Table(name = "seguro")
public class Seguros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 40)
    private String nombre;

    @Column(name = "tasa")
    private double tasa;

    public Seguros() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    @Override
    public String toString() {
        return "Seguros{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tasa=" + tasa +
                '}';
    }
}
