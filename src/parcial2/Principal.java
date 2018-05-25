package parcial2;

import java.util.Scanner;

public class Principal extends Calculador {

    public static void main(String[] args) {

        Calculador miCalculador = new Calculador();
        Scanner miEscaner = new Scanner(System.in);
        Punto miPunto = new Punto();
        
        System.out.println("Ingrese x1");        
        int x1;
        x1 = miEscaner.nextInt();
        System.out.println("Ingrese y1");        
        int y1;
        y1 = miEscaner.nextInt();
        
        System.out.println("Ingrese x2");        
        int x2;
        x2 = miEscaner.nextInt();
        System.out.println("Ingrese y2");        
        int y2;
        y2 = miEscaner.nextInt();
        
        System.out.println("La distancia entre los 2 puntos es");  
        double CalcularDistancia = miPunto.CalcularDistancia(x1, x2, y1, y2);
        System.out.println(CalcularDistancia);

    }

}
