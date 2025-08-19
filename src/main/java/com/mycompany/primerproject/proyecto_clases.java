/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproject;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

class Persona {
    private String td, nombre;
    private int id, edad;
    private char sexo;
    
    protected Scanner scanner = new Scanner(System.in);
    
    public void datosp() {
        System.out.print("Ingresar tipo docu: ");
        td = scanner.next();
        
        System.out.print("Ingresar id: ");
        id = scanner.nextInt();
        
        System.out.print("Ingresar nombre: ");
        nombre = scanner.next();
        
        System.out.print("Ingresar edad: ");
        edad = scanner.nextInt();
        
        System.out.print("Ingresar sexo: ");
        sexo = scanner.next().charAt(0);
    }
    
    public void imprimirp() {
        System.out.println("td: " + td);
        System.out.println("id: " + id);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("sexo: " + sexo);
    }
}

class Estudiante extends Persona {
    private float auxilio;
    
    public void setaux() {
        System.out.print("Auxilio estudiantil: ");
        auxilio = scanner.nextFloat();
    }
    
    public float getaux() {
        return auxilio;
    }
}

class Profesor extends Persona {
    private String titulo;
    private float sueldo;
    
    public void settitulo() {
        System.out.print("Ingrese titulo: ");
        titulo = scanner.next();
    }
    
    public void setsueldo() {
        System.out.print("Ingrese sueldo: ");
        sueldo = scanner.nextFloat();
    }
    
    public String gettitulo() {
        return titulo;
    }
    
    public float getsueldo() {
        return sueldo;
    }
}

public class proyecto_clases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        Estudiante e1 = new Estudiante();
        Profesor p1 = new Profesor();
        
        do {
            System.out.print("Ingrese la opcion deseada 1 para estudiante - 2 para profesor - 3 para salir: ");
            opc = scanner.nextInt();
            
            switch(opc) {
                case 1:
                    System.out.println("-----Informacion Estudiante-------");
                    e1.datosp();
                    e1.setaux();
                    System.out.println("\nDatos impresos estudiantes:");
                    e1.imprimirp();
                    System.out.println("Auxilio estudiantil: " + e1.getaux());
                    break;
                    
                case 2:
                    System.out.println("\n--------Informacion docente----");
                    p1.datosp();
                    p1.settitulo();
                    p1.setsueldo();
                    System.out.println("\nDatos impresos profesor:");
                    p1.imprimirp();
                    System.out.println("Titulo: " + p1.gettitulo());
                    System.out.println("Sueldo: " + p1.getsueldo());
                    break;
                    
                case 3:
                    System.out.println("Muchas gracias - adios");
                    break;
                    
                default:
                    System.out.println("opcion incorrecta:");
                    break;
            }
        } while(opc != 3);
        
        scanner.close();
    }
}
