import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.*;

//Lienzo para dibujar el grafo
class Lienzo extends JPanel
{
    private Ellipse2D actual;
    private Line2D arista;
    private Point2D po, pd;
    private Grafo grafo;
    private String Nombre="";
    private char Tipo='-';
    private double peso=1;
    
    //constructor
    public Lienzo(Grafo g1) {
		
	grafo = g1;  //asignamos la referencia para manejarla
	actual = null;
        arista = null;
	po = pd = null;
        setLayout(null);
        
	//agregamos codigo para que el lienzo "oiga" al raton
	addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evento)
            {
		Point2D x = evento.getPoint();
		if(grafo.getVertice(x) == null && grafo.getListaVertices().size()<grafo.getOrden()){ //no existe vertice
                    Nombre=JOptionPane.showInputDialog("Nombre del Vertice: ");
                    Tipo=JOptionPane.showInputDialog("Tipo: E,C,R,O,S").charAt(0);
                    if(Nombre.equals("")){
                        grafo.agregarVertice(x);
                    }else{
                        grafo.agregarVertice(x,Nombre,Tipo); 
                    }
                    repaint();
                }else{
                    JOptionPane.showMessageDialog(null, "El numero de vertices no puede ser mayor al orden.\nOrden actual:"+grafo.getOrden(),"Orden inferior", JOptionPane.ERROR_MESSAGE);
                }       
            }
			
	//es llamado cuando se presiona el raton sobre un componente
	//se utiliza para indicar el inicio de la arista
            public void mousePressed(MouseEvent evento)
            {
                Point2D x = evento.getPoint();
            //si de presiona sobre algun vertice este se marca como inicial(po)
                if(grafo.getVertice(x) != null){
                    po = grafo.getVertice(x).getOrigen();
                }else{
                    po = null;
                }	
            }

        //es llamado cuando se suelta el raton sobre un componente
        //se utiliza para indicar el fin de la arista
            public void mouseReleased(MouseEvent evento)
            {
                Point2D x = evento.getPoint();
		if(grafo.getVertice(x) != null){
		//ya existe el vertice origen marcado
                    if(po != null) {
			pd = grafo.getVertice(x).getOrigen();
                        try{
//JOptionPane.YES_OPTION,JOptionPane.NO_OPTION, JOptionPane.CANCEL_OPTION, JOptionPane.OK_OPTION, JOptionPane.CLOSED_OPTION:
                        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso del Vertice: "));
                        grafo.agregarArista(po, pd,peso);
                        }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error,Ingrese un valor Entero","Advertencia", JOptionPane.WARNING_MESSAGE);
                        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso del Vertice: "));
                        grafo.agregarArista(po, pd,peso);
                        }
                    }
                }
                repaint();
            }  
	}); // fin de la clase interna
		
	//Ahora "oira" cuando se mueva el raton
	addMouseMotionListener(new MouseMotionAdapter(){
	//Va a cambiar de icono del cursos al pasar por los vertices
            public void mouseMoved(MouseEvent evento)
            {
                if(grafo.getVertice(evento.getPoint()) == null){
                    setCursor(Cursor.getDefaultCursor());
                }else{
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                }					
            }
	}); // fin de la clase interna Motion
    } // fin constructor
    
    public void paintComponent(Graphics g){
        
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/Mapa.png"));
        g.drawImage(imagen.getImage(),0,0,this.getWidth(),this.getHeight(),this);
        setOpaque(false);
        
        
	super.paintComponent(g);
 	Graphics2D g2 = (Graphics2D)g;
	grafo.dibujar(g2, this);
    }		
		
} //clase