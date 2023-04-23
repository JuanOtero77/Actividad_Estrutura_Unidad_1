/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class punto4_ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] ventas = { 455.0, 300.0, 153.0, 230.0, 400.0};
        //desendente
        OrdenarVentasDesendente(ventas);
        System.out.println("Ventas de forma desendente: "+Arrays.toString(ventas));
        //asendente
        OrdenarVentasAscendente(ventas);
        System.out.println("Ventas de forma asendente: "+Arrays.toString(ventas));
        //desordenar
        DesordenarVentas(ventas);
        System.out.println("Ventas en desorden: "+Arrays.toString(ventas));
        //Ordenar primero pares y despues impares
        OrdenarVentasParesImpares(ventas);
        System.out.println("Ventas ordenadas en pares y luego en impares: "+Arrays.toString(ventas));
    }
    //función que permita ordenar las ventas de forma descendente
    public static void OrdenarVentasDesendente (double[] ventas){
        Arrays.sort(ventas);
        for(int i = 0 ; i<ventas.length / 2; i++){
            double temp = ventas[i];
            ventas[i] = ventas[ventas.length -1 -i];
            ventas[ventas.length -1 -i] = temp;
        } 
    }
    //función que permita que permita ordenar las ventas de forma ascendente
    public static void OrdenarVentasAscendente (double[] ventas){
        Arrays.sort(ventas);
    }
    //función que permite desordenar las ventas
    public static void DesordenarVentas (double[] ventas){
        Random r = new Random();
        for(int i = ventas.length -1; i > 0; i--){
            int j = r.nextInt(i+1);
            double temp = ventas[i];
            ventas[i] = ventas[j];
            ventas[j] = temp;
        }
    }
    //función que permita ordenar las ventas primero las pares y luego en impares
    public static void OrdenarVentasParesImpares (double[] ventas){
        double[] pares = new double[ventas.length];
        double[] impares = new double[ventas.length];
        int p = 0, i =0;
        for(double venta : ventas){
            if(venta % 2 == 0){
                pares[p++] = venta;
            } else{
                impares[i++] = venta;
            }
        }
        Arrays.sort(pares, 0,p);
        Arrays.sort(impares, 0,i);
        System.arraycopy(pares, 0, ventas, 0, p);
        System.arraycopy(impares, 0, ventas, p, i);
    }
}
