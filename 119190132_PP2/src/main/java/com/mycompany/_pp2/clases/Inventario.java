/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._pp2.clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kenda
 */
public class Inventario implements Serializable {

    private Map<Integer, VideoJuego> inventarioJuegos;
    private int numeroJuego;
    int key = 0;

    public Inventario() {
        this.inventarioJuegos = new HashMap<>();
    }

    public void agregarJuego(VideoJuego juego ) {
       
        juego.setTituloJuego(JOptionPane.showInputDialog(null, "nomkbre"));
        juego.setColosolaDisponible(JOptionPane.showInputDialog(null, "consola"));
        juego.setAnoLanzamiento(JOptionPane.showInputDialog(null, "ano"));
        juego.setPrecio(Double.valueOf(JOptionPane.showInputDialog(null, "precio 2.0")));
        this.numeroJuego++;
        inventarioJuegos.put(numeroJuego, juego);
        System.out.print(this.numeroJuego);
    }

    public VideoJuego buscarJuego(String nombreJuegoABuscar) {
        for (int i = 0; i < this.inventarioJuegos.size(); i++) {
            VideoJuego juego = inventarioJuegos.get(i);
            if (juego != null && nombreJuegoABuscar != null && juego.getTituloJuego().equals(nombreJuegoABuscar)) {
                key = i; // update the class field, not a local variable
                return juego;
            }
        }
        throw new IllegalArgumentException("Juego no encontrado");
    }

    public void eliminarJuego() {
        String juegoAEliminar = JOptionPane.showInputDialog(null, "Ingrese el nombre del juego a eliminar: ");
        VideoJuego juegoEliminado = buscarJuego(juegoAEliminar);
        if (juegoEliminado != null && juegoEliminado.getTituloJuego() != null) {
            this.inventarioJuegos.remove(key, juegoEliminado); // use the updated key value
            System.out.println("juego eliminado " + juegoEliminado);
        }
    }

    public void almacenar() {
        try {
            FileOutputStream copiaInventario = new FileOutputStream("Inventario.PP2");
            ObjectOutputStream salida = new ObjectOutputStream(copiaInventario);
            salida.writeObject(inventarioJuegos);  // Almacena todo el mapa
            salida.close();
            copiaInventario.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leerAlmacen() {
        FileInputStream copiaInventario2;
        try {
            copiaInventario2 = new FileInputStream("Inventario.PP2");
            ObjectInputStream input = new ObjectInputStream(copiaInventario2);
            inventarioJuegos = (Map<Integer, VideoJuego>) input.readObject();
            input.close();
            copiaInventario2.close();
            System.out.println("Mostrando juegos en JOptionPane...");
            StringBuilder nombresJuegos = new StringBuilder("Juegos en el inventario:\n");
            for (Map.Entry<Integer, VideoJuego> entry : inventarioJuegos.entrySet()) {
                VideoJuego juego = entry.getValue();
                System.out.println(juego.getTituloJuego());
            }
            System.out.println("Caballo H de las montanas");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void imprimirInventario() {
        for (int i = 0; i < this.inventarioJuegos.size(); i++) {
            VideoJuego juego = this.inventarioJuegos.get(i);
            if (juego != null && juego.getTituloJuego() != null) {
                System.out.println(juego.getTituloJuego());
            }
        }
    }

    public VideoJuego obtenerJuego(String nombreJuego) {
        for (VideoJuego juego : this.inventarioJuegos.values()) {
            if (juego != null && juego.getTituloJuego() != null && juego.getTituloJuego().equals(nombreJuego)) {
                return juego;
            }
        }
        throw new IllegalArgumentException("Juego no encontrado");
    }

}
