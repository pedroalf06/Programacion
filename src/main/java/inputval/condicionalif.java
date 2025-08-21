/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputval;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class condicionalif {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        
        
        String nombre;
        double sueldo, valorh, descuento=0;
        int horast;
        
        System.out.println("Ingrese nombre del trabajador: ");
        nombre = in.nextLine();
        
        System.out.println("ingrese numero de horas trabajadas: ");
        horast = in.nextInt();
        
        System.out.println("ingrese valor por hora: ");
        valorh = in.nextFloat();
        
        sueldo = horast * valorh;
        
        if(sueldo>100000){
            descuento = 0.16 * (sueldo);
            System.out.println("porcentaje de descuento de retencion: "+ descuento);
        } else {
            System.out.println("No hay descuendto");
        }
        
        
        System.out.println("nombre: "+nombre);
        System.out.println("Sueldo: "+ (sueldo - descuento));
        
         
     
}
    
}
