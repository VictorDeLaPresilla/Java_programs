
package AvionRes;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
    
    
        Scanner teclado = new Scanner(System.in);
        //Creación de Objeto.
        Avion avion = new Avion();
        //Declaración de variables.
        String condicion;
        char letra;
        int clase;
        int i = 1;
        do {
            System.out.println("Bienvenido cliente nº " + i);
            do {
                System.out.println("Desea viajar en Primera clase [1] o en clase Económica"
                        + " [2]");
                clase = teclado.nextInt();
                if (clase == 1) {
                    avion.AsientoPrimera();
                } else if (clase == 2) {
                    avion.AsientoEconomico();
                } else {
                    System.out.println("Sólo disponemos de Primera clase[1] o clase "
                            + "Económica [2]");
                }
            } while (clase != 1 && clase != 2);
            i++;
        } while (!avion.avionLleno());
        System.out.println("Lo sentimos, el avión esta lleno.");
    }
}
        

    



