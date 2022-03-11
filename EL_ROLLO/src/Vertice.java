import java.awt.*;
import java.awt.geom.*;
import java.io.Serializable;

class Vertice implements Serializable{
    private String nombre;
    private int index;
    private boolean visitado;
    public static int nVertices = 0;  //contador  de vertices creados
    private char tipo; //E=extras C=cascada R=rollo O=olas S=surfing
    //Atributos Graficos
    private Point2D origen; //punto origen
    private Ellipse2D circulo;  //circulo
    private Color E=Color.YELLOW,C=Color.GREEN,R=Color.ORANGE,O=Color.BLUE,S=Color.MAGENTA,color;
    private final static int diametro = 18;
    private Font fuenteVertice = new Font("FreeMono",Font.PLAIN,18);
	
    public Vertice(){
        this(new Point2D.Double(0,0));
    }

    public Vertice(Point2D p){
        this(p, ""+(nVertices+1),'-');
    }
   
    public Vertice(Point2D p, String nombre,char tipo){
        double x = p.getX();
        double y = p.getY();
        origen = p;
        circulo = new Ellipse2D.Double(x-diametro/2,y-diametro/2,diametro,diametro);
        this.nombre = nombre;
        this.tipo=tipo;
        switch(tipo){
            case 'E':setColor(E);
                break;
            case 'C':setColor(C);
                break;
            case 'R':setColor(R);
                break;
            case 'O':setColor(O);
                break;
            case 'S':setColor(S);
                break;
            default: setColor(Color.GRAY);
        }
        this.index =nVertices++;
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
    public void setColor(Color c){
   	color = c;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public char getTipo(){
        return tipo;
    }
    public void setTipo(char tipo){
        this.tipo = tipo;
    }
   
   public void dibujar(Graphics2D g2){
   	g2.setPaint(color);
   	g2.fill(circulo); //dibujar lleno
    	g2.setPaint(Color.BLACK);
        g2.setFont(fuenteVertice); //Cambia la fuente
        g2.drawString(this.getNombre(), (float)this.origen.getX()-5 , (float) this.origen.getY()+3); //Escribimos en el vertice
   }

    public Ellipse2D getCirculo() {
        return circulo;
    }
    public void setCirculo(Ellipse2D circulo) {
        this.circulo = circulo;
    }
    public Point2D getOrigen(){
        return origen;
    }

    void setColor(javafx.scene.paint.Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} //fin clase vertice