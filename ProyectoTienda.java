/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotienda;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProyectoTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre=EntradaSalida.obtenerNombre();
        int precio=EntradaSalida.obtenerPrecio();
        
        
            
        
        int stock=EntradaSalida.obtenerStock();
        EntradaSalida objeto=new EntradaSalida();
        objeto.metodoSaludar();
        // Producto(String nombre, int precio, int stock) 
        Producto p=new Producto(nombre, precio, stock);
        
        System.out.println("Producto: "+p);
    }
    
    
}
