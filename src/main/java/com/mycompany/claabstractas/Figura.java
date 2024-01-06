
package com.mycompany.claabstractas;

public abstract class Figura {
    
    protected double x; // pos en x
    protected double y; // pos en y

    protected Figura() {      // constructor
    }

    public Figura(double x, double y) { // constructor
        this.x = x;
        this.y = y;
    }
    
    
    
    public abstract double calcularArea();  // metodo
    
}
