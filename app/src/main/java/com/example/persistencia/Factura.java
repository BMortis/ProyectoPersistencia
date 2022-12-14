package com.example.persistencia;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private int folio;
    private String fecha;
    private String rut;

    public Factura(int folio, String fecha, String rut) {
        this.folio = folio;
        this.fecha = fecha;
        this.rut = rut;
    }

    private int neto;
    private int iva;
    private int total;

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
