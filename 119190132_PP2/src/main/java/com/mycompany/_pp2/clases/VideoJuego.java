/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pp2.clases;

import java.io.Serializable;

/**
 *
 * @author kenda
 */
public class VideoJuego implements Serializable{
    private String tituloJuego;
    private String ColosolaDisponible;
    private String anoLanzamiento;
    private Double precio;

    public VideoJuego(String tituloJuego, String ColosolaDisponible, String anoLanzamiento, Double precio) {
        this.tituloJuego = tituloJuego;
        this.ColosolaDisponible = ColosolaDisponible;
        this.anoLanzamiento = anoLanzamiento;
        this.precio = precio;
    }

    public VideoJuego() {
    }

    
    public String getTituloJuego() {
        return tituloJuego;
    }

    public void setTituloJuego(String tituloJuego) {
        this.tituloJuego = tituloJuego;
    }

    public String getColosolaDisponible() {
        return ColosolaDisponible;
    }

    public void setColosolaDisponible(String ColosolaDisponible) {
        this.ColosolaDisponible = ColosolaDisponible;
    }

    public String getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(String anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
}
