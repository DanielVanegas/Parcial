/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Estudiantes
 */
public class Calculador implements ICalculador{
    
    Punto punto1, punto2;
    
    @Override
    public double CalcularDistancia() {
        
        
        
        
       int d = x2-x1;
       int a = y2-y1;
       double m = Math.pow(d, 2);
       double z = Math.pow(a, 2);
       double w = m-z;
       double o = Math.sqrt(w);
       return w;
    }

    @Override
    public double CalcularArea() {
       return 0;
        
    }

    @Override
    public double CalcularPendiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double CalcularDistancia(int x1, int x2, int y1, int y2) {
        
        int d = x2-x1;
       int a = y2-y1;
       double m = Math.pow(d, 2);
       double z = Math.pow(a, 2);
       double w = m-z;
       double o = Math.sqrt(w);
       return w;
        
    }
    
}
