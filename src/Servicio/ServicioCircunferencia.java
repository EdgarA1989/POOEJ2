/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class ServicioCircunferencia {
    
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        Circunferencia v1 = new Circunferencia();
        System.out.println("Ingrese el radio de la Circunferencia: ");
        v1.setRadio(leer.nextDouble());
        return v1;
    }
    public void area(Circunferencia a){
        double Area = Math.PI *(Math.pow(a.getRadio(),2));
        System.out.println("El valor del Area de la Circunferencia es: "+ Area);
        
    }
    
    public void perimetro(Circunferencia a){
        double Peri = 2 * Math.PI * a.getRadio();
        System.out.println("El valor del Perimetro de la Circunferencia es: "+ Peri);
        
    }
}
