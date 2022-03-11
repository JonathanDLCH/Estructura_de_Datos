/**
 *
 * @author Yalu
 */
public class Vertice {
    private String nombre;
    private int index;
    private boolean visitado;

    public Vertice(String nombre, int index){
        this.nombre = nombre;
        this.index = index;
    }

    public Vertice(String nombre){
        this(nombre, 1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setIndex(int index){
        this.index = index;
    }
    
    public int getIndex(){
        return index;
    }
}
