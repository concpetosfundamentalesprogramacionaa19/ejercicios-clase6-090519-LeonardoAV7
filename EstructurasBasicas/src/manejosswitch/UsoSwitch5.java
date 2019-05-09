/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Desarrollar una aplicacion que me permita ingresar placas de carros, 
        se asume que las placas ingresadas pertenecen a la region costa del
        Ecuador, en base a la placa nuestro programa determinará y presentara
        la placa con la provincia la que pertenece
        */
        
        String placa;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la placa de su carro: ");
        placa = entrada.nextLine();
        char valor = placa.charAt(0);
        
        switch(valor){
            case 'o':
            case 'O':
                System.out.printf("Pertenece a la Porvincia de El Oro - %s\n", 
                         placa.toUpperCase());
                break;
            
            case 'm':
            case 'M':
                System.out.printf("Pertenece a la Porvincia de Manabí - %s\n", 
                         placa.toLowerCase());
                break;    
            
            case 'r':
            case 'R':
                System.out.printf("Pertenece a la Porvincia de Los Ríos - %s\n", 
                         placa.toUpperCase());
                break;
                
            case 'g':
            case 'G':
                System.out.printf("Pertenece a la Porvincia del Guayas - %s\n", 
                         placa.toUpperCase());
                break;
             
            case 'y':
            case 'Y':
                System.out.printf("Pertenece a la Porvincia del Santa Elena - "
                        + " %s\n",  placa.toUpperCase());
                break;
                
            case 'j':
            case 'J':
                System.out.printf("Pertenece a la Porvincia del Santo Domingo"
                        + " - de los Tsachilas: %s\n", placa.toUpperCase());
                break;
                
            case 'e':
            case 'E':
                System.out.printf("Pertenece a la Porvincia del Esmeraldas "
                        + "- %s\n", placa.toUpperCase());
                break;
                
        }
        
    }
}
