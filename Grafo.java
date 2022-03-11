
import java.util.ArrayList;

/**
 *
 * @author Yalu
 */
public class Grafo {
    private boolean dirigido;  //por defautl NO dirigido - FALSE
    private ArrayList <Vertice> vertices; //arreglo de vértices
    private int A[][];   //Representación con matriz de adyacencia
    private int orden;
    private int pos; //Indice de vertices

    public Grafo(int n, boolean dirigido){
        vertices = new ArrayList();
        A = new int[n][n];
        this.dirigido = dirigido; 
        orden = n;
        pos = 0;
    }

    public Grafo(int n) {
        this(n, false);//por default NO dirigido
    }
    
    public Grafo(){
        this(20);  //Por default hasta de 15 vértices
    }

    public void agregaVertice(String nom){
        if(pos < orden){
            Vertice v = new Vertice(nom, pos);
            vertices.add(pos, v);
            pos++;
        }
        else
            System.out.println("Numero de vertices excedido");
    }

    public void mostrarMatriz(){
        System.out.println("\nMatriz de Adyacencia");
        for(int i=0; i<pos; i++) {
            for(int j=0; j<pos; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }

    //mostrar la lista de v�rtices
    public void mostrarVertices(){
    	System.out.println("\nLista de vertices");
        for(Vertice v : vertices){
            System.out.println("Vertice: "+v.getNombre()+" indice: "+v.getIndex());
        }
    }

    //TODO -implementa las siguientes funciones
    public void agregaArista(String vo, String vd, int peso){
        int fila=0,columna=0;
        for(Vertice v : vertices){ //Buscamos los vertices.
            
            if(v.getNombre().equals(vo)){
                fila=v.getIndex();
                //System.out.println(v.getIndex());
            }
            if(v.getNombre().equals(vd)){
                columna=v.getIndex();
                //System.out.println(v.getIndex());
            }
        }
        A[fila][columna]=peso;
    }

    public void agregaArista(String vo, String vd){
        int fila=0,columna=0;
        for(Vertice v : vertices){ //Buscamos los vertices.
            
            if(v.getNombre().equals(vo)){
                fila=v.getIndex();
                //System.out.println(v.getIndex());
            }
            if(v.getNombre().equals(vd)){
                columna=v.getIndex();
                //System.out.println(v.getIndex());
            }
        }
        A[fila][columna]=1;
    }
}
