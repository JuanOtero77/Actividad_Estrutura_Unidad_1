/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto_3;

/**
 *
 * @author LENOVO
 */
public class punto3_Venta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] ventas = { 350.0, 125.0, 100.0, 230.0, 110.0};
        System.out.println("La venta más alta es: "+BuscarVentaAlta(ventas));
        System.out.println("La venta más baja es: "+BuscarVentaBaja(ventas));
        System.out.println("El total de las ventas son: "+ObtenerTotalVenta(ventas));
        System.out.println("El promedio total de las ventas es: "+ObtenerPromedioVenta(ventas));
        System.out.println("La venta que se acerque al promedio es: "+ObtenerVentaCercanaPromedio(ventas));
    }
    //Funcion que permita buscar la venta más alta
    public static double BuscarVentaAlta (double[] ventas){
        double ventaAlta = ventas[0];
        for (double venta : ventas) {
            if(venta > ventaAlta){
                ventaAlta = venta;
            }
        }
        return ventaAlta;
    }
    //Funcion que permita buscar la venta más baja
    public static double BuscarVentaBaja (double[] ventas){
        double ventaBaja = ventas[0];
        for (double venta : ventas) {
            if(venta < ventaBaja){
                ventaBaja = venta;
            }
        }
        return ventaBaja;
    }
    //Funcion que permita obtener el total de las ventas
    public static double ObtenerTotalVenta (double[] ventas){
        double TotalVenta = 0;
        for(double venta : ventas){
            TotalVenta += venta;
        }
        return TotalVenta;
    }
    //Funcion que permita obtener el promedio de las ventas
    public static double ObtenerPromedioVenta (double[] ventas){
        double TotalVenta = ObtenerTotalVenta(ventas);
        double PromedioVentas = TotalVenta / ventas.length;
        
        return PromedioVentas;
    }
    //Funcion que la venta cuyo valor se acerque más al valor que le sigue al promedio
    public static double ObtenerVentaCercanaPromedio (double[] ventas){
        double PromedioVentas = ObtenerPromedioVenta(ventas);
        double VentaCercanaPromedio = ventas[0];
        double difVCercanaPromedio = Math.abs(VentaCercanaPromedio - PromedioVentas);
        for(double venta : ventas){
                double difVenta = Math.abs(venta - PromedioVentas);
            if(difVenta < difVCercanaPromedio){
                VentaCercanaPromedio = venta;
                difVenta = difVCercanaPromedio;
            }
        }
        return VentaCercanaPromedio;
    }
}