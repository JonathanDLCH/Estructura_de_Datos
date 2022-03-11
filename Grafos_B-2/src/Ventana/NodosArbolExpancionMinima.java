/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author Hacks_s
 */
import java.awt.geom.Ellipse2D;
public class NodosArbolExpancionMinima {
    Ellipse2D nodo;
    int x,y;
    int diametro;
    int NodosAdyacentes;
    int IdNodo;
    public NodosArbolExpancionMinima(int NodosAdyacentes,int IdNodo){
        this.NodosAdyacentes=NodosAdyacentes;
        this.IdNodo=IdNodo;
    }

    public Ellipse2D getNodo() {
        return nodo;
    }

    public void setNodo(Ellipse2D nodo) {
        this.nodo = nodo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getNodosAdyacentes() {
        return NodosAdyacentes;
    }

    public void setNodosAdyacentes(int NodosAdyacentes) {
        this.NodosAdyacentes = NodosAdyacentes;
    }

    public int getIdNodo() {
        return IdNodo;
    }

    public void setIdNodo(int IdNodo) {
        this.IdNodo = IdNodo;
    }
    
}
