package com.felipemamani.primerparcialsis414.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "universidades")
public class Universidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ciudad;
    private Integer fundacion;
    private String rector;

    public Universidad() {
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public Integer getFundacion() { return fundacion; }
    public void setFundacion(Integer fundacion) { this.fundacion = fundacion; }

    public String getRector() { return rector; }
    public void setRector(String rector) { this.rector = rector; }
}