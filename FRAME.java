
package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Grafos.Grafos;
import Grafos.MostrarMatriz;
import Grafos.MostrarMatrizGND;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import Ventana.AlgoritmoPrim;
        
public class FRAME extends javax.swing.JFrame implements ActionListener{
    // declaraciones
    JPanel barra_sup;
    Fondo p;
    JLabel titu;
    JLabel titulo = new JLabel("J_GRAFOS v 1.0 beta");
    JButton salida, minimiza, continuar,dijkstra,Floyd,Prim;
    Grafos nuevo;
    private int u = 0;
    private JMenuBar barra;
    private JMenu menu_archivo, menu_opciones, menu_ayuda, menu_Algo;
    String help = "\n- Para crear NODOS presionar clic izquierdo dos veces\n\n."+"- Para crear ARISTAS arrastrar el cursor con clic derecho partiendo del un NODO hacia otro NODO.\n\n"
    + "- Para cambiar de grafo DIRIGIDO a NO DIRIGIDO, pesionar clic derecho sobre un nodo y escoger la\nla opcion deseada.\n\n" + "- Para mostrar matriz de costos precionar clic derecho y selecionar MATRIZ DE COSTOS.\n\n";
    private JMenuItem  pesoManual,MenuItem_Abrir, MenuItem_Nuevo, MenuItem_Ayuda,Dijkstra,guardar,guardar2,exportar,floyd,prim,salir,GenerarMatrizGD,GenerarMatrizGND;
    private final int x,y;
    private boolean D,F,P,pM;
    Toolkit s = Toolkit.getDefaultToolkit();
    Dimension pantalla = s.getScreenSize();
    // fin de las declaraciones
    
    public FRAME(){
        x=(int)pantalla.getWidth();
        y=(int)pantalla.getHeight();
        nuevo = new Grafos();
        nuevo.setVisible(false);
        setSize(x,y);
        setLayout(null);
        setTitle("J_GRAFOS v 1.0 beta");
        setUndecorated(true);
        setLocationRelativeTo(null);
        primera_ventana();
        segunda_ventana();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(s.getImage(this.getClass().getResource("Logo1.1.png")));
        // para futuras acciones
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                     JOptionPane.showMessageDialog(null,"hola");
                }
            }

        });
    }
    
    private void primera_ventana(){
        p = new Fondo();
        titu = new JLabel("J_GRAFOS");
        continuar = new JButton("Nuevo Proyecto");
        
        p.setLayout(null);
        p.setBounds(0,0, x, y);
        titu.setBounds(200, 100, 800, 300);
        titu.setBackground(Color.white);
        titu.setFont(new Font("TimesRoman",Font.BOLD,10));
        continuar.setBounds(500, 570, 150, 50);
        continuar.setBackground(new Color(33,97,140));
        continuar.setForeground(Color.white);
        continuar.addActionListener(this);
        
        p.add(titu);
        p.add(continuar);
        add(p);
        
    }
    
    public void crearMenu(){
	    
        barra = new JMenuBar();
        menu_archivo=new JMenu("Archivo");
        menu_opciones=new JMenu("Opciones");
        menu_ayuda=new JMenu("Ayuda");
        menu_Algo = new JMenu("Herramientas");
        
        MenuItem_Abrir=new JMenuItem("Abrir");
        MenuItem_Nuevo=new JMenuItem("Nuevo");
        MenuItem_Ayuda=new JMenuItem("Ayuda");
        GenerarMatrizGD=new JMenuItem("Generar Matriz (Grafo Dirigido)");
        GenerarMatrizGND=new JMenuItem("Generar Matriz (Grafo NO Dirigido)");
        
        Dijkstra = new JMenuItem("Algoritmo Dijkstra");
        guardar = new JMenuItem("Guardar");
        exportar = new JMenuItem("Exportar como imagen");
        floyd = new JMenuItem("Algoritmo Floyd");
        prim = new JMenuItem("Algoritmo Prim");
        salir = new JMenuItem("salir");
        pesoManual = new JMenuItem("Introducir peso manualmente");
        
        menu_archivo.add(MenuItem_Abrir);
        menu_archivo.add(guardar);
        //menu_archivo.add(guardar2);
        menu_archivo.add(exportar);
        menu_archivo.add(MenuItem_Nuevo);
        menu_archivo.add(salir);
        menu_ayuda.add(MenuItem_Ayuda);
        menu_Algo.add(Dijkstra);
        menu_Algo.add(floyd);
        menu_Algo.add(prim);
        menu_opciones.add(GenerarMatrizGD);
        menu_opciones.add(GenerarMatrizGND);
        menu_opciones.add(pesoManual);
        barra.add(menu_archivo);
        barra.add(menu_opciones);
        barra.add(menu_ayuda);
        barra.add(menu_Algo);
        nuevo.setLayout(null);
        barra.setBounds(0, 0, 1200, 20);
        
        nuevo.add(barra);
        
        MenuItem_Nuevo.addActionListener( this );
        
        MenuItem_Abrir.addActionListener( this );

        
        menu_ayuda.addActionListener(this);
        
        Dijkstra.addActionListener(this);
        floyd.addActionListener(this);
        salir.addActionListener(this);
        prim.addActionListener(this);
        GenerarMatrizGND.addActionListener(this);
        GenerarMatrizGD.addActionListener(this);
        pesoManual.addActionListener(this);
    }
    
    private void botones(){
        dijkstra = new JButton("Dijkstra");
        Floyd = new JButton("Floyd");
        Prim = new JButton("Prim");
        
        dijkstra.setBounds(0, 0, 100, 30);
        dijkstra.setBackground(new Color(52, 152, 219));
        if(D == true){
            barra_sup.add(dijkstra);
            barra_sup.repaint();
        }
    }
    
    private void segunda_ventana(){
        crearMenu();
        barra_sup = new JPanel();
        
        nuevo.setBounds(0,0,x,y);
        barra_sup.setBounds(0,(int)pantalla.getHeight()-30,(int)pantalla.getWidth(),30);
        barra_sup.setBackground(new Color(52, 152, 219));
        barra_sup.setLayout(null);
        nuevo.add(barra_sup);
        add(nuevo);
        //botones();
    }
    
    public void actionPerformed(ActionEvent e){
        // organizar
        if(e.getSource() == menu_ayuda){
            JOptionPane.showMessageDialog(null, help, "Ayuda", JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource() == guardar2){
            Guardado archivo = new Guardado();
            try {
                archivo.GuardarNodos(nuevo.Nodos(),"primer archivo");
            } catch (IOException ex) {
                Logger.getLogger(FRAME.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource() == continuar){
            p.setVisible(false);
            nuevo.setVisible(rootPaneCheckingEnabled);
            u = 1;
        }
        if(e.getSource() == MenuItem_Nuevo){
            if(nuevo.situacion_pantalla() ==  true){
                nuevo.limpiar();
            }
        }
        if(e.getSource()== pesoManual){
            nuevo.limpiar();
                nuevo.pesoManual(!pM);
                pM = !pM;
                if (pM) {
                    pesoManual.setText("Introducir peso automatico");
                } else {
                    pesoManual.setText("Introducir peso manualmente");
                }
        
        }
        
        if(e.getSource() == Dijkstra){
            D = true;
            VentanaD v1 = new VentanaD();
            v1.setLocationRelativeTo(null);
            v1.setVisible(rootPaneCheckingEnabled);
        }else{
            if(e.getSource() == floyd){
                VentanaF v2 = new VentanaF();
                v2.setLocationRelativeTo(null);
                v2.setVisible(rootPaneCheckingEnabled);
            }else{
                if(e.getSource() == prim){
            //D = true;
            AlgoritmoPrim v3 = new AlgoritmoPrim(nuevo);
            //v3.setLocationRelativeTo(null);
            v3.setVisible(rootPaneCheckingEnabled);
            }else{
             if(e.getSource() == GenerarMatrizGD){
            D = true;
            MostrarMatriz v4 = new MostrarMatriz(nuevo);
            v4.setLocationRelativeTo(null);
            v4.setVisible(rootPaneCheckingEnabled);
        } else{
               if(e.getSource() == GenerarMatrizGND){
            D = true;
            MostrarMatrizGND v5 = new MostrarMatrizGND(nuevo);
            v5.setLocationRelativeTo(null);
            v5.setVisible(rootPaneCheckingEnabled);
        } 
               
               
               
               }
            }
                
                }
            if(e.getSource() == salir){
                System.exit(0);
            }
        }
    }
    
    public static void main(String []args){
        
        FRAME vent = new FRAME();
        vent.setVisible(true);
    }
}
