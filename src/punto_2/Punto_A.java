/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_2;

/**
 *
 * @author LENOVO
 */
public class Punto_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*************************************************");
        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        String[] caracteristicas = {
            "Simples, Circulares y Enlazadas",
            "Primero en entrar, Primero en Salir. Último en entrar, Primero en salir",
            "Primero en entrar, Último en salir",
            "Parejas de clave y valor",
            "Elementos no repetidos",};
        for (int i = 0; i < dataStructs.length; i++) {
            System.out.println(dataStructs[i] + " - " + caracteristicas[i]);
        }
        System.out.println("*************************************************");
    }
}
