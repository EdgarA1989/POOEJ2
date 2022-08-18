/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_guia7;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EJ2_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCircunferencia var = new ServicioCircunferencia();
        int opcion=0;
        
        Circunferencia v1 = var.crearCircunferencia();
        while (opcion!=3){
        System.out.println("------------MENU-------------");
        System.out.println("1-Calcular AREA");
        System.out.println("2-Calcular PERIMETRO");
        System.out.println("3-SALIR");
        opcion= leer.nextInt();
            switch (opcion) {
                case 1:
                    var.area(v1);
                    break;
                case 2:
                    var.perimetro(v1);
                    break;
            }
        } 
       
    }
    
}
