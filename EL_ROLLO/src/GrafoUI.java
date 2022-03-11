import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

public class GrafoUI extends JFrame {

    Archivo a1 = new Archivo();
    private Lienzo lienzo;
    protected Grafo grafo; //referencia al grafo
    private JPanel pOpciones;
    private JButton btRecorridoBFS,btRecorridoDFS,btGuardar;
    private JLabel lbresultados;
    
    private Color AzulLogo = new Color(102,204,255);
    private Color NaranjaLogo = new Color(255,153,0);
    
      //constructor
    public GrafoUI(Grafo grafo,Archivo a1){
        super("El Rollo, Creador de Rutas");
        setLayout(new BorderLayout(2,2));
        this.setExtendedState(6);
        //this.setResizable(false);
        
	this.grafo = grafo; //Se conoce el grafo
        this.a1=a1;
        //a1.escribirGrafo(grafo);
        pOpciones = new JPanel();
        pOpciones.setLayout(new FlowLayout());
        pOpciones.setBackground(AzulLogo);
	lienzo = new Lienzo(this.grafo); //pasamos al grafo para que el liezo lo conozca
        getContentPane().add(lienzo);
	initComponentes();
        pack();
   }
    
    public Grafo getGrafo(){
        return this.grafo;
    }
    public void setGrafo(Grafo grafo){
        this.grafo=grafo;
    }


    private void initComponentes(){
        
        btGuardar = new JButton("Guardar");
        btGuardar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                a1.escribirGrafo(grafo);
            }
            
        });
        
        btRecorridoBFS = new JButton("Recorrido a lo profundo");
        btRecorridoBFS.setBackground(NaranjaLogo);
        btRecorridoBFS.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        btRecorridoBFS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btRecorridoBFS){
                    grafo.dfs("1", ""); //Pasamos el nodo
                }
            }
        });
        
        btRecorridoDFS = new JButton("Recorrido a lo ancho");
        btRecorridoDFS.setBackground(NaranjaLogo);
        btRecorridoDFS.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        btRecorridoDFS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btRecorridoDFS){
                    grafo.dfs("1", "");
                }
            }
        });
        
        lbresultados = new JLabel("Aqui van los resultados");
        lbresultados.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        
        pOpciones.add(btGuardar);
        pOpciones.add(btRecorridoBFS);
        pOpciones.add(btRecorridoDFS);
        pOpciones.add(lbresultados);
        add(pOpciones,BorderLayout.SOUTH);
        add(lienzo,BorderLayout.CENTER );
    }
}
