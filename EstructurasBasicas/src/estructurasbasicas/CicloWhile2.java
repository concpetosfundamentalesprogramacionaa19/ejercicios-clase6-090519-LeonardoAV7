/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class CicloWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensajeFinal = "";
        String nombre;
        String apellido;
        String profesion;
        String opcion;
        boolean bandera = true;
        int contador = 1;
        
        Scanner entrada = new Scanner(System.in);
        
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, 
                "Informe de la ciudad de Loja");
        
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, 
                "Listado de Personas");
        
        while (bandera == true){
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido:");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su profesión:");
            profesion = entrada.nextLine();
            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n",
                    mensajeFinal, contador, nombre, apellido, profesion);
            contador = contador + 1; 
            System.out.println("Digite 's' para seguir o 'n' para salir");
            opcion = entrada.nextLine();
            if (opcion.equals("s")){
                bandera = true;
            }else{
                bandera = false;
            }
            
        }
        
        System.out.printf("%s", mensajeFinal);
        
    }
    
}
