package Grafos;

import java.awt.Point.*;
import java.awt.event.MouseAdapter;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import java.awt.Point;

public class Nodo {

    private ArrayList<Linea> arista;
    private Point2D punto;
    private final int id;
    private ArrayList<Enlace> pertenencia;

    public Nodo(Point2D punto, int id) {

        pertenencia = new ArrayList<>();
        arista = new ArrayList<>();
        this.id = id;
        punto.setLocation(punto.getX() - 40 / 2, punto.getY() - 40 / 2);
        this.punto = punto;

    }
    
    public int getId(){
    
        return id;
        
    }

    public void addArista(Line2D line) {

        arista.add(new Linea(line));

    }

    public void addPertenencia(boolean status, int id) {
        
        boolean bandera = false;
        
        for(int i = 0; i < pertenencia.size(); i++){
        if(id == pertenencia.get(i).getId()){
        bandera = true;
        break;
        }
        
        }
        
        if(!bandera){    
        pertenencia.add(new Enlace(status, id));
        bandera = false;
        }
       
        
    }
    
    public int tamPertenencia() {

       return pertenencia.size();
       

    }
    
    public boolean existe(int id){
    
        boolean bandera = false;
        
        for(int i = 0; i < pertenencia.size(); i++){
        if(id == pertenencia.get(i).getId()){
        bandera = true;
        break;
        }
        
        }
        
        return bandera;
    
    }

    public Point2D getPunto() {

        return punto;

    }
    
    public boolean statusPertenencia(int d){
    
        return pertenencia.get(d).getStatus();
    
    }
    
    public void remover(int n){
    
        for (int i = 0; i < pertenencia.size(); i++) {
            
            if (pertenencia.get(i).getId() == n) {
                pertenencia.remove(i);
            }

        }
    
    }
    
    public int idPertenencia(int d){
    
        return pertenencia.get(d).getId();
    
    }

    class Enlace {

        private boolean status;
        private int id;

        public Enlace(boolean s, int id) {

            status = s;
            this.id = id;
        
        }
        
        public int getId(){
        
            return id;
        
        }
        
        public boolean getStatus(){
        
            return status;
        
        }
        
        

    }

}
