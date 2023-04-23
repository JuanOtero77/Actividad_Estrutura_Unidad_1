/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_2;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class Ventas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar un arreglo llamado ventas
        //Inicializar el arreglo ventas con una cantidad aleatoria de elementos 
        Random r = new Random();
        int NumVentas = r.nextInt(10) + 1;
        int[] ventas = new int[NumVentas];
        //Llenar el arreglo ventas con valores aleatorios entre 1 y 1000
        for(int i =0; i<ventas.length; i++){
            ventas[i] = r.nextInt(1000) + 1;
        }
        //Mostrar la cantidad de ventas
        System.out.println("*************************************************");
        System.out.println("La cantidad de la ventas son: "+ventas.length);
        System.out.println("*************************************************");
        //Mostrar el valor de cada una de las ventas
        System.out.println("el valor de cada venta es: ");
        for(int venta: ventas){
            System.out.println(venta);
        }
        System.out.println("*************************************************");
        //Mostrar el total de ventas
        int TotalVentas = 0;
        for(int venta: ventas){
            TotalVentas += venta;
        }
        System.out.println("total de las ventas son: "+TotalVentas);
        System.out.println("*************************************************");
        //Mostrar el promedio de las ventas
        double PromedioVentas = (double)TotalVentas / ventas.length;
        System.out.println("Promedio total de las ventas son: "+PromedioVentas);
        System.out.println("*************************************************");
    }
    
}
