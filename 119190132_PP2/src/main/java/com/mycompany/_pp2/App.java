/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._pp2;

import com.mycompany._pp2.GUI.*;
import com.mycompany._pp2.clases.Inventario;
import com.mycompany._pp2.clases.VideoJuego;
import javax.swing.JOptionPane;

/**
 *
 * @author kenda
 */
public class App {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
}
