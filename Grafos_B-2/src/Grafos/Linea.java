package Grafos;

import java.awt.Point;
import java.awt.geom.Line2D;

public class Linea {

    private Line2D linea;
    private boolean estatus;
    private int[] nodos;
    private int peso;
    //private boolean;
    
    public Linea(Line2D l) {
        peso = 0;
        linea = l;
        estatus = true;
        nodos = new int[2];

    }
    
    public void setPeso(int p){
        peso = p;
    }
    
    public int getPeso(){
        return peso;
    }

    public void cambio(boolean t) {

        estatus = t;

    }

    public void nodoUno(int nodon) {

        nodos[0] = nodon;

    }

    public void nodoDos(int nodon) {

        nodos[1] = nodon;

    }
    
    public int nodoUno(){
    
        return nodos[0];
    
    }
    
    public int nodoDos(){
    
        return nodos[1];
    
    }

    public Line2D linea() {

        return linea;

    }

    public boolean status() {

        return estatus;

    }

    public void back() {

        estatus = true;

    }

    public int distancia() {

        double d;

        d = Math.sqrt(Math.pow((linea.getX2() - linea.getX1()), 2) + Math.pow((linea.getY2() - linea.getY1()), 2));

        return (int) d / 10;

    }

    public double distanciaEDP() {

        double d;

        d = Math.sqrt(Math.pow((linea.getX2() - linea.getX1()), 2) + Math.pow((linea.getY2() - linea.getY1()), 2));

        return d;
    }

    public Point puntoM() {

        /*    double x = ((linea.getX1() + linea.getX2()) / 2);
        double y = ((linea.getY1() + linea.getY2()) / 2);*/
        double x = ((linea.getX1() + 3 * linea.getX2()) / 4);
        double y = ((linea.getY1() + 3 * linea.getY2()) / 4);

        // return new Point((int)(x+linea.getX2())/2,(int)(y+linea.getY2())/2);
        return new Point((int) x, (int) y);
    }
}
