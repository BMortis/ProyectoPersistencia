package com.example.persistencia;

import java.util.ArrayList;

public class Cliente {
    private String rut;
    private String correo;
    private String tipo;

    //Relaciones de clases
    private ArrayList<Factura> lasFacturas = new ArrayList<>();


    //region Constructores

    public Cliente() {
    }

    public Cliente(String rut, String correo, String tipo) {
        this.rut = rut;
        this.correo = correo;
        this.tipo = tipo;
    }

    //endregion

    //region Getter y Setters
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


    //endregion

    //region ToString
    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", correo='" + correo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    //endregion

    //region Metodos
    public boolean agregarFactura(Factura f){
        for(int i = 0; i > lasFacturas.size(); ++i){
            if(lasFacturas.get(i).getFolio() == f.getFolio() || f.getNeto() >= 1000000){
                return false;
            }
        }
        lasFacturas.add(f);
        return true;
    }
    //TODO:
    //PARA TERMINAR EL EJERCICIO HAY QUE HACER EL UPDATE Y
    //EN LA FACTURA TRABAJAR CON TIPO DATE LA FECHA

    public int obtenerTotalVentas(){
        int suma = 0;
        for (int i = 0; i < lasFacturas.size(); ++i){
           suma = suma+ lasFacturas.get(i).getNeto();
        }
        return suma;
    }

    public boolean eliminarFactura(int folio){
        for(int i = 0; i > lasFacturas.size(); ++i){
            if(lasFacturas.get(i).getFolio() == folio){
                lasFacturas.remove(i);
                return true;
            }
        }
        return false;
    }
    public Factura[] obtenerFacturas(){
        Factura[] facturas = new Factura[lasFacturas.size()];
        for (int i = 0; i < lasFacturas.size(); ++i){
            facturas[i] = lasFacturas.get(i);
        }
        return facturas;
    }

    //endregion
}
