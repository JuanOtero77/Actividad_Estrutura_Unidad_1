/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto_5;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[][] lenguajes = new Object[5][8];
        lenguajes[0] = new Object[]{"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};
    }
    //Funcion que permita llenar la matriz lenguajes con datos por teclado a partir de la segunda fila.
    public static void infoLenguajes(Object[][] lenguajes) {
        Scanner tc = new Scanner(System.in);
        for (int i = 1; i < lenguajes.length; i++) {
            for(int j = 0; j<lenguajes[i].length; j++){
                System.out.println("Ingresar un valor para la fila: "+i+" y la columna: "+j);
                lenguajes[i][j] = tc.nextLine();
            }
        }
    }
    //Funcion que encuentre el nombre de un lenguaje
    public static boolean buscarNombreLenguaje(String nombre, Object[][] lenguajes){
        for(int i = 1; i < lenguajes.length; i++){
            if(lenguajes[i][0] != null && lenguajes[i][0].equals(nombre)){
                return true;
            }
        }
        return false;
    }
    // función que reciba  las coordenadas 
    public static int[] CordenadasLenguaje(String nombre, Object[][] lenguajes){
        for(int i = 1; i < lenguajes.length; i++){
            if(lenguajes[i][0] != null && lenguajes[i][0].equals(nombre)){
                return new int[] {i,0};
            }
        }
        return null;
    }
    //Funcion obtener datos de las filas.
    public static Object[] ObtenerDatosFila(int fila, Object[][] lenguajes){
        if(fila >= lenguajes.length || fila < 0){
           throw new IndexOutOfBoundsException("la fila "+fila+" esta errada");
        }
        return lenguajes[fila];
    }
    //Funcion obtener datos de las columnas.
    public static Object[] ObtenerDatoscolumna(int columna, Object[][] lenguajes){
        if(columna >= lenguajes[0].length || columna < 0){
           throw new IndexOutOfBoundsException("la columna "+columna+" esta errada");
        }
        Object[] datosColum = new Object[lenguajes.length - 1];
        for(int i = 0; i < lenguajes.length; i++){
            datosColum[i] = lenguajes[i][columna];
        }
        return datosColum;
    }
    //Funcion obtener los valores de las coordenadas
    public static Object[] ValorCordenadas(int columna, int fila, Object[][] lenguajes){
        if(fila < 1 || fila >= lenguajes.length || columna < 0 || columna >= lenguajes[0].length){
            throw new IndexOutOfBoundsException("coordenadas invalidas");
        }
        Object[] registroValor = lenguajes[fila];
        Object valor = registroValor[columna];
        return new Object[]{valor, registroValor};
    }
    //Funcion cordenadas filas y colcumnas
    public static int[] obtenerCordenadas(String nombre, Object[][] lenguajes){
        for(int i = 1; i < lenguajes.length; i++){
            for(int j = 0; j < lenguajes.length; j++){
                if(lenguajes[i][j] != null && lenguajes[i][j].equals(nombre)){
                    return new int[]{i,j};
                }
            }
    }
        return null;
    }
}
