package com.example.persistencia;

import java.util.ArrayList;

public class Cliente {
    private String rut;
    private String correo;
    private String tipo;

    //Relaciones de clases
    private ArrayList<Factura> lasFacturas = new ArrayList<>();


    public Cliente() {
    }

    public Cliente(String rut, String correo, String tipo) {
        this.rut = rut;
        this.correo = correo;
        this.tipo = tipo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", correo='" + correo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
