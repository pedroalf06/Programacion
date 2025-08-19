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
public class inputVal {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Inicializo el escaner
		Scanner in  = new Scanner (System.in);
		
		//declaro las variables
		
		boolean boolVal;
		byte byteVal;
		char charVal;
		short shortVal;
		int intVal;
		long longVal;
		float floatVal;
		double doubleVal;
		
	System.out.println("Ingrese la variable Boolena: ");
	boolVal = in.nextBoolean();
	
	System.out.println("Ingrese la variable byte: ");
	byteVal = in.nextByte();
	
	System.out.println("Ingrese la variable Char: ");
	charVal = in.next().charAt(0);
	
	System.out.println("Ingrese la variable short: ");
	shortVal = in.nextShort();
	
	System.out.println("Ingrese la variable long: ");
	longVal = in.nextLong();
	
	System.out.println("Ingrese la variable float: ");
	floatVal = in.nextFloat();
	
	System.out.println("Ingrese la variable double: ");
	doubleVal = in.nextDouble();
	
	//Imprimir
	System.out.println("Boolean: "+ boolVal);
	System.out.println("byte: "+ byteVal);
	System.out.println("char: "+ charVal);
	System.out.println("short: "+ shortVal);
	}
    
}
