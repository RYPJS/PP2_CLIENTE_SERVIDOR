/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._pp2;

import com.mycompany._pp2.clases.Inventario;

/**
 *
 * @author kenda
 */
public class App {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarJuego();
        inventario.agregarJuego();
        inventario.eliminarJuego();
        inventario.imprimirInventario();
        inventario.agregarJuego();
        inventario.imprimirInventario();

    }
}
