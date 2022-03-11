import java.awt.*;
import java.awt.geom.*;
import java.io.Serializable;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Jonathan De La Cruz Huerta
 *   Estructuras de Datos
 */

class Grafo implements Serializable{
    private boolean dirigido;
    private int orden; //orden del grafo
    private ArrayList <Vertice> vertices;
    private Arista [][]M;  //matriz de adyacencia
    private int matrizAdyBin[][]; //Matriz de adyacencia Binaria
    private String recorrido="";
	
    public Grafo(int orden, boolean dirigido){
        vertices = new ArrayList();
        M = new Arista[orden][orden];
        this.dirigido = dirigido; 
        this.orden = orden-1;
    }
    public Grafo(){
        this(68);
    }
    public Grafo(int n){
        this(n,false);
    }
        
        public int getOrden(){
            return orden;
        }
        public void setOrden(int newOrden){
            orden=newOrden;
        }
        public ArrayList<Vertice> getListaVertices(){
            return vertices;
        }

	public void agregarVertice(Point2D p){
            Vertice v = new Vertice(p);
            vertices.add(v); //Se agrega al array
            System.out.println(this.mostrarVertices());           
	}

        public void agregarVertice(Point2D p, String nombre,char tipo){
            Vertice v = new Vertice(p,nombre,tipo);
            vertices.add(v); //Se agrega al array
            System.out.println(this.mostrarVertices());            
        }

	//obtiene el primer Vertice que contenga el punto p
	public Vertice getVertice(Point2D p)
	{
            for(Vertice v: vertices)
		if(v.getCirculo().contains(p)) return v;
            return null;
	}

	
	public void agregarArista(Point2D po, Point2D pd){
            //TODO: crear una arista y agregarla a la matriz
            //donde corresponde de acuerdo a los vertices
            // po y pd, son los puntos origen de los vertices
            Arista a = new Arista(po,pd);
            Vertice vo,vd;
            vo = getVertice(po); //obtenemos los vertices
            vd = getVertice(pd);
            //matrizAdyBin[vo.getIndex()][vd.getIndex()]=1;
            M[vo.getIndex()][vd.getIndex()] = a; //se asigna la arista
            M[vd.getIndex()][vo.getIndex()] = a; //se asigna la arista /se agrega en ambos sentidos ya que no es dirigido.
	}
        
        public void agregarArista(Point2D po, Point2D pd,double peso){
            //TODO: crear una arista y agregarla a la matriz
            //donde corresponde de acuerdo a los vertices
            // po y pd, son los puntos origen de los vertices
            Arista a = new Arista(po,pd,peso);
            Vertice vo,vd;
            vo = getVertice(po); //obtenemos los vertices
            vd = getVertice(pd);
            //matrizAdyBin[vo.getIndex()][vd.getIndex()]=(int) peso;
            M[vo.getIndex()][vd.getIndex()] = a; //se asigna la arista
            M[vd.getIndex()][vo.getIndex()] = a; //se asigna la arista /se agrega en ambos sentidos ya que no es dirigido.
	}
	
        //mostrar la lista de vertices
        public String mostrarVertices(){
            String cad = " ";
            for(Vertice v: vertices)
                cad += v.getNombre()+", ";
            return cad;
        }
        
        //mostrar la matriz de adyacencia
        public void matrizAdyacencia(){
            Arista a;
            String cad = "";
            for(int i=0;i<this.orden;i++){
                for(int j=0;j<this.orden;j++){
                    if(M[i][j] != null){
                        cad+=(int)M[i][j].getPeso()+" ";
                        //System.out.println(cad);
                    }else{
                        cad+="0 ";
                        //System.out.println(cad);
                    }
                }
                cad+="\n";
            }
            JOptionPane.showMessageDialog(null, cad ,"Matriz de Adyacencia", JOptionPane.PLAIN_MESSAGE);
        }

	public void dibujar(Graphics2D g2, JPanel l){
       //pintamos los vertices
            for(int i=0;i<orden;i++){
                for(int j=0;j<orden;j++){
                    if(M[i][j]!=null){
                        M[i][j].dibujar(g2);
                    }
                }
            }
            
            for(Vertice v: vertices) {
                v.dibujar(g2);
            }
	}
        
        //Metodos especiales de Grafos
    public String dfs(String in,String recorridoDFS){ //Recorrido primero en profundidad-(Depth-First Search)
        recorrido = recorridoDFS;
        Vertice Vi=buscar(in);
        Vertice sig;
        
        if(!Vi.isVisitado()){ //Verificamos que no este visitado
            recorrido = recorrido+ " " +Vi.getNombre();
            Vi.setVisitado(true); //Marcamos el vertice como visitado
            
            for(int i=0;i<orden;i++){ //Buscamos vertices adyacentes
                if(M[Vi.getIndex()][i]!=null){ //Si es adyacente...
                    sig = vertices.get(i); 
                    dfs(sig.getNombre(),recorrido);
                }
            }
        }
        return recorrido;
    }
    
    public Vertice buscar(String dato){ //Busca un vertice apartir de un dato;
        int band=0;
        Vertice dt= null;
        for(Vertice v : vertices){
            if(v.getNombre().equals(dato)){
                band=1;
                dt=v;
            }
        }
        if(band==1){
            return dt;
        }else{
            System.out.println("Vertice no encontrado.");
            return dt;
        }
    }
    
    public void restablecerVisitados(){
        for(Vertice v : vertices){
            v.setVisitado(false);
        }
        System.out.println("Todos los vertices estan sin visitar");
    }
} //clase