/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package samuelgarciaeducastur.es.biblioteca2025;

import java.util.ArrayList;

/**
 *
 * @author alu09d
 */
public class Biblioteca2025 {

    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamo;
    
    
    public Biblioteca2025() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamo = new ArrayList();
    }
    
    public static void main(String[] args) {
        Biblioteca2025 b = new Biblioteca2025();
    }

}
