import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.io.Serializable;

/**
 *
 * @author jonathan
 */
public class Arista implements Serializable{
    private double peso;
    private Point2D p1,p2;
    private Color color;
    private Line2D linea;
    
    public Arista(Point2D pi,Point2D pf){
        color=Color.BLACK;
        this.p1=pi;
        this.p2=pf;
        this.peso=1;
        this.linea = new Line2D.Double(pi.getX(),pi.getY(),pf.getX(),pf.getY());
    }
    
    public Arista(Point2D pi,Point2D pf,double peso){
        color=Color.BLACK;
        this.peso=peso;
        this.p1=pi;
        this.p2=pf;
        this.linea = new Line2D.Double(pi.getX(),pi.getY(),pf.getX(),pf.getY());
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
        
    public void dibujar(Graphics2D g2){
   	g2.setPaint(color);
   	g2.draw(linea); //dibujar lleno
        if(p1.getX()>p2.getX() && p1.getY()>p2.getY()){ //x1 mas a la derecha y Y1 mas abajo
            g2.drawString(String.valueOf(peso), (int) (p1.getX()-Math.abs((p1.getX()-p2.getX())/2)), (int) (p1.getY()-Math.abs((p1.getY()-p2.getY())/2)));
        }
        if(p1.getX()<p2.getX() && p1.getY()<p2.getY()){
            g2.drawString(String.valueOf(peso), (int) (p2.getX()-Math.abs((p1.getX()-p2.getX())/2)), (int) (p2.getY()-Math.abs((p1.getY()-p2.getY())/2)));
        }
        if(p1.getX()>p2.getX() && p1.getY()<p2.getY()){
            g2.drawString(String.valueOf(peso), (int) (p1.getX()-Math.abs((p1.getX()-p2.getX())/2)), (int) (p2.getY()-Math.abs((p1.getY()-p2.getY())/2)));
        }
        if(p1.getX()<p2.getX() && p1.getY()>p2.getY()){ //x1 mas a la derecha y Y1 mas abajo
            g2.drawString(String.valueOf(peso), (int) (p2.getX()-Math.abs((p1.getX()-p2.getX())/2)), (int) (p1.getY()-Math.abs((p1.getY()-p2.getY())/2)));
        }
   }
}
