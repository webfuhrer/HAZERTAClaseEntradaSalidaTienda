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
public class EntradaSalida {
    String metodoSaludar()
    {
        return "Hola, qué tal";
    }
    static int obtenerPrecio()
    {
        int precio=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el precio del producto");
        precio=sc.nextInt();
        return precio;
    }
    static int obtenerStock()
    {
        int stock=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el stock del producto");
        stock=sc.nextInt();
        return stock;
    }
    static String obtenerNombre()
    {
        String aux="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el nombre del producto");
        aux=sc.nextLine();
        return aux;
    }
}
