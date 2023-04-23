/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class puntoE_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //punto E
        System.out.println("*************************************************");
        System.out.println("punto E:");
        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        for(int i=0; i<5; i++){
            System.out.println(dataStructs[i]);
        }
        System.out.println("*************************************************");
        //punto F y G
        Scanner teclado = new Scanner(System.in);
        String[] características = new String[5];
        System.out.println("Punto F:");
        System.out.println("ingresar la primera caracteristica: ");
        características[0] = teclado.nextLine();
        System.out.println("ingresar la segunda caracteristica: ");
        características[1] = teclado.nextLine();
        System.out.println("ingresar la tercera caracteristica: ");
        características[2] = teclado.nextLine();
        System.out.println("ingresar la cuarta caracteristica: ");
        características[3] = teclado.nextLine();
        System.out.println("ingresar la quinta caracteristica: ");
        características[4] = teclado.nextLine();
        
        System.out.println("Caractieristicas:");
        for(int j=0; j<características.length; j++){
            System.out.println(características[j]);
        }
        System.out.println("*************************************************");
    }
    
}
