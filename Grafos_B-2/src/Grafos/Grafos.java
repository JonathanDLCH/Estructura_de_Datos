package Grafos;

import javax.swing.*;
import java.awt.*;
import java.awt.Point.*;
import java.awt.event.MouseAdapter;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.util.*;
import Ventana.Floyd;

public final class Grafos extends JPanel {
    Floyd claseFloyd;
    private ArrayList<Ellipse2D> nodos;
    public static ArrayList<Nodo> nodo;
    private ArrayList<ListaVertices> numeroIDNodo;
    private static ArrayList<Matriz> matriz;
    private ArrayList<Linea> arista;
    private ArrayList<Linea> aristaAux;
    private Ellipse2D current;
    private Ellipse2D currenttemp;
    private ArrayList circulos;
    private static final int dimSide = 40;
    private boolean seleccion;
    private Rectangle2D recuadro;
    private int nodoN;
    private boolean anadir;
    private MenuClic menu;
    protected boolean conexion;
    protected boolean menuOp;
    private int nAristaC;
    private ArrayList<Integer> tamano;
    private int mover;
    protected int conta;
    protected int contadorLineas;
    private int nodoTemp;
    private boolean statusA;
    private MatrizDeCostos matrizDC;
    private boolean pesoManual;
    private boolean yaesta;
    public static ArrayList<ArrayList<Double>> ArrayL;
    public static ArrayList<ArrayList<Double>> ArrayAux;
    ArrayList<valoresMatriz> matrizDECOSTOS;
    //public int largo, alto;

    public Grafos() {
        matrizDECOSTOS= new ArrayList<valoresMatriz>();
       
        ArrayL = new ArrayList<ArrayList<Double>>();
        ArrayAux = new ArrayList<ArrayList<Double>>();
        yaesta = true;
        pesoManual = false;
        matriz = new ArrayList<>();
        circulos = new ArrayList<>();
        tamano = new ArrayList<>();
        nodo = new ArrayList<>();
        numeroIDNodo = new ArrayList<>();
        arista = new ArrayList<>();
        statusA = false;
        nodoTemp = 0;
        contadorLineas = 0;
        conta = 0;
        mover = 0;
        nodoN = -1;
        current = null;
        currenttemp = null;

        seleccion = false;

        nAristaC = -1;
        conexion = false;
        menuOp = true;
        menu = new MenuClic();

        recuadro = new Rectangle2D.Double(0, 0, dimSide, dimSide);
        nodos = new ArrayList<>();
        current = null;
        currenttemp = null;

        seleccion = false;
        anadir = false;

        add(menu);
        situacion();

    }
    
    
//    public ArrayList<Linea> retornarAristas(){
//            aristaAux = arista;
//        return aristaAux;
//    }
//    public ArrayList<Linea> retornarAristas(){
//            aristaAux = arista;
//        return aristaAux;
//    }

    public class MenuClic extends JPopupMenu {

        JMenuItem borrarN;
        JMenuItem dirigido;
        JMenuItem dirigidoN;
        JMenuItem matriz;

        public MenuClic() {

            borrarN = new JMenuItem("Borrar NODO");
            dirigido = new JMenuItem("Grafo Dirigido");
            dirigidoN = new JMenuItem("Grafo No Dirigido");
            matriz = new JMenuItem("Matriz de Costos");
            add(borrarN);
            add(new JSeparator());
            add(dirigido);
            add(dirigidoN);
            add(matriz);

            borrarN.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }

            });
            dirigido.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    menuOp = true;
                }

            });
            dirigidoN.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    menuOp = false;
                }

            });

            matriz.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    for (int i = 0; i < arista.size(); i++) {
                        currenttemp = find(arista.get(i).linea().getP2());
                        if (currenttemp == null) {
                            arista.remove(i);
                            for (int k = 0; k < nodo.size(); k++) {

                                nodo.get(k).remover(i);

                            }

                            contadorLineas--;
                        }

                    }

                    if (!arista.isEmpty()) {

                        if (!menuOp) {
                            matrizDeCostosND();
                        } else {
                            matrizDeCostos();
                        }
                    }
                }

            });

        }

    }

    public void situacion() { //Analiza si la posicion en la pantalla esta ocupada o no

        addMouseListener(new MouseAdapter() {
            Ellipse2D r;
            int contenedor;

            @Override
            public void mousePressed(MouseEvent e) {

                for (int i = 0; i < arista.size(); i++) {

                    if (arista.get(i).status()) {
                        arista.remove(i);
                        for (int k = 0; k < nodo.size(); k++) {

                            nodo.get(k).remover(i);

                        }

                        contadorLineas--;
                    }

                }

                if (!arista.isEmpty()) {
                    System.out.println("TAMAÑO DE ARREGLO ARISTAS  --- " + arista.size());
                    System.out.println("TAMAÑO en NODO " + "[" + nodoN + "] --- " + nodo.get(nodoN).tamPertenencia());
                }
                for (int i = 0; i < arista.size(); i++) {

                    if (nodoN == arista.get(i).nodoUno() && nodoTemp == arista.get(i).nodoDos()) {
                        contenedor = i;

                    }

                }

                //Eliminar ARISTAS inecesarias
                current = find(e.getPoint());

                if (current == null && SwingUtilities.isLeftMouseButton(e)) {
                    anadir = true;

                } else {

                    //Creacion de linea
                    if (find(e.getPoint()) != null && SwingUtilities.isRightMouseButton(e)) {
                        if (yaesta) {
                            arista.add(new Linea(new Line2D.Double(current.getX(), current.getY(), current.getX(), current.getY())));

                            if (nNodoC(e.getPoint()) != -1) {
                                nodoN = nNodoC(e.getPoint());
                            }
                            nodo.get(nodoN).addPertenencia(true, contadorLineas);
                            arista.get(contadorLineas).nodoUno(nodoN);
                            contadorLineas++;

                            if (nArista(nodoN) != -1) {

                                nAristaC = (nArista(nodoN));
                                conexion = true;
                            }
                        }
                        yaesta = true;
                        repaint();

                    }

                    //Arratrar los elementos
                    if (find(e.getPoint()) != null && SwingUtilities.isLeftMouseButton(e)) {

                        /*if (!tamano.isEmpty()) {
                            for (int q = 0; q < tamano.size(); q++) {
                                arista.get(tamano.get(q)).back();
                            }
                        }

                        tamano.clear();*/
                        conexion = false;
                        current = find(e.getPoint());
                        seleccion = true;
                        recuadro.setFrame(current.getX(), current.getY(), dimSide, dimSide);

                        if (nNodoC(e.getPoint()) != -1) {
                            nodoN = (nNodoC(e.getPoint()));

                        }

                        System.out.println("TAMAÑO DE ARREGLO ARISTAS  --- " + arista.size());
                        System.out.println("TAMAÑO en NODO " + "[" + nodoN + "] --- " + nodo.get(nodoN).tamPertenencia());
                    } else {

                        if (find(e.getPoint()) == null) {
                            seleccion = false;
                        }

                        //  clickedcount = 0;
                    }

                }

            }

            @Override
            public void mouseClicked(MouseEvent e) { //Optiene la posicion (x,y) y se las pasa al nodo (Ellipse2D)

                int contador = e.getClickCount();

                if (anadir && contador == 2 && SwingUtilities.isLeftMouseButton(e)) {

                    posicion(e.getPoint());
                    nodo.add(new Nodo(e.getPoint(), conta));
                    numeroIDNodo.add(new ListaVertices( conta));
                    conta++;
                    anadir = false;
                    // matrizDeCostos();
                } else {

                    if (find(e.getPoint()) == null) {
                        seleccion = false;
                    }
                }

                if (find(e.getPoint()) != null && SwingUtilities.isRightMouseButton(e)) {

                    menu.show(e.getComponent(), e.getX(), e.getY());
                    nodoN = nNodoC(e.getPoint());

                }

                repaint();
            }

        });

        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseMoved(MouseEvent e) {
                if (find(e.getPoint()) == null) {
                    setCursor(Cursor.getDefaultCursor());
                } else {

                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                }

            }

            @Override
            public void mouseDragged(MouseEvent e) {

                Ellipse2D r;

                if (seleccion && SwingUtilities.isLeftMouseButton(e) && !conexion) {

                    recuadro.setFrame(e.getX() - dimSide / 2, e.getY() - dimSide / 2, dimSide, dimSide);

                    //cambiamos los valores tanto en NODO como en CIRCULOS
                    nodo.get(nodoN).getPunto().setLocation(e.getX() - dimSide / 2, e.getY() - dimSide / 2);
                    r = (Ellipse2D) circulos.get(nodoN);
                    r.setFrame(e.getX() - dimSide / 2, e.getY() - dimSide / 2, dimSide, dimSide);

                    int tam;
                    for (int i = 0; i < nodo.get(nodoN).tamPertenencia(); i++) {

                        if (!nodo.get(nodoN).statusPertenencia(i)) {
                            tam = nodo.get(nodoN).idPertenencia(i);
                            arista.get(tam).linea().setLine(arista.get(tam).linea().getP1(), e.getPoint());

                        } else {
                            tam = nodo.get(nodoN).idPertenencia(i);
                            arista.get(tam).linea().setLine(e.getPoint(), arista.get(tam).linea().getP2());

                        }
                        if (!pesoManual) {
                            matriz.get(tam).setPeso(arista.get(tam).distancia());
                        }
                    }
                    setCurrent(nodoN, e.getX() - dimSide / 2, e.getY() - dimSide / 2);

                }

                if (SwingUtilities.isRightMouseButton(e)) {

                    r = (Ellipse2D) circulos.get(nodoN);
                    double x = r.getX() + dimSide / 2;
                    double y = r.getY() + dimSide / 2;

                    if (find(e.getPoint()) != null && find(e.getPoint()) != r && arista.get(nAristaC).status()) {

                        current = find(e.getPoint());
                        arista.get(nAristaC).linea().setLine(x, y, current.getX() + dimSide / 2, current.getY() + dimSide / 2);
                        nodoTemp = nNodoC(e.getPoint());
                        statusA = true;
                    }

                }

                if (statusA && !nodo.get(nodoTemp).existe(contadorLineas - 1) && arista.get(nAristaC).status()) {

                    nodo.get(nodoTemp).addPertenencia(false, contadorLineas - 1);
                    arista.get(contadorLineas - 1).nodoUno(nodoTemp);
                    arista.get(nAristaC).cambio(false);
                    if (!pesoManual) {
                        matriz.add(new Matriz(nodoN, nodoTemp, arista.get(nAristaC).distancia(), nAristaC));
                    }
                    statusA = false;
                    if (pesoManual) {
                        while (arista.get(nAristaC).getPeso() == 0) {
                            try {
                                int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el PESO"));
                                arista.get(nAristaC).setPeso(n);
                                matriz.add(new Matriz(nodoN, nodoTemp, n, nAristaC));
                            } catch (NumberFormatException e1) {
                                JOptionPane.showMessageDialog(null, "ERROR en formato");
                            }
                        }
                    }

                }
                repaint();

            }

        });

    }

     ///////////////////////////////////////METODOS/////////////////////////////////////////////////////////////
    public String[][] FinalPrim(){
        
        int tamaño=matriz.size();
        
        double MatrizFPrimAUX[][]=new double[tamaño][tamaño];
        //int MatrizFPrimAUX2[][]=new int[tamaño][tamaño];
        String MatrizFPrimAUX3[][]=new String[tamaño][tamaño];
        double MatrizResultado[][]=new double[tamaño][tamaño];
        
       // double arrayAuxiliar[][]= new double [numero][numero];
        //arrayAuxiliar=claseFloyd.ConvierteArrayenMatrizReturn(ArrayL);
        MatrizFPrimAUX=GenerarMatrizGNDPrim();
       //JOptionPane.showMessageDialog(null,"Se genero matriz de alg prim"+MatrizFPrimAUX.toString());
//              for (int i=0;i<TamañoMatriz();i++){
//           for(int j=0;j<TamañoMatriz();j++){
//               //String matriz=MatrizFPrimAUX[i][j];
//               //String totalString = String.valueOf(MatrizFPrimAUX[i][j]);
//               System.out.println("valOR DE MATRIZ "+totalString+"\n"+i+"  "+j);
//           }
//            
//        }
//        for (int i=0;i<TamañoMatriz();i++){
//           for(int j=0;j<TamañoMatriz();j++){
//               MatrizFPrimAUX2[i][j]=(int)MatrizFPrimAUX[i][j];
//           }
//            
//        }
       // String cadena = String.valueOf(entero);
        //AlgPrim(MatrizFPrimAUX2);
      // JOptionPane.showMessageDialog(null,"Estas llamando a algprim");
       MatrizResultado= AlgPrim(MatrizFPrimAUX);
        //JOptionPane.showMessageDialog(null,"ya tienes matriz resultado");
        for (int i=0;i<TamañoMatriz();i++){
           for(int j=0;j<TamañoMatriz();j++){
              
               MatrizFPrimAUX3[i][j]=String.valueOf(MatrizResultado[i][j]);
//               System.out.println("IMPRIMIENDO MATRIZ FINAL");
//               System.out.println(MatrizFPrimAUX3[i][j]);
           }
            
        }
//        System.out.println("MAtriz resultado\n");
//        for (int i=0;i<TamañoMatriz();i++){
//           for(int j=0;j<TamañoMatriz();j++){
//              
//               System.out.print("[ "+MatrizFPrimAUX3[i][j]+"]"+"  ");
//              
//           }
//            System.out.println();
//        }
        
        
        
       return MatrizFPrimAUX3;
        
    }
    public static double[][] ConvierteArrayenMatriz(ArrayList<ArrayList<Double>> ArraydeListas){
        int n = ArraydeListas.size();
        double [][]MatrizConvertida = new double [n][n];
        for(int i = 0; i < ArraydeListas.size(); i++){
            for(int j = 0; j < ArraydeListas.get(i).size(); j++){
                MatrizConvertida[i][j] = ArraydeListas.get(i).get(j);
            }
        }       
        return MatrizConvertida;
    }
    public String[][] F(){
         double [][]Matriz = new double [nodos.size()][nodos.size()];
         double [][]MatrizResultado = new double [nodos.size()][nodos.size()];
         String [][]MatrizAux = new String[nodos.size()][nodos.size()];
        Matriz = ConvierteArrayenMatriz(this.ArrayL);
        MatrizResultado=AlgPrim(Matriz);
        for(int i=0;i<nodos.size();i++){
          for(int j=0;j<nodos.size();j++){
              MatrizAux[i][j]=String.valueOf(MatrizResultado[i][j]);
          }
        
        }
        return MatrizAux;
    }
    
     public double[][] AlgPrim(double[][] Matriz) {  //Llega la matriz a la que le vamos a aplicar el algoritmo
//        for (int i=0;i<numeroIDNodo.size();i++){
//            System.out.println("Valores de numeroidnodo "+numeroIDNodo.get(i).getN());
//        
//        }
            
//        JOptionPane.showMessageDialog(null,"Estas imprimiendo el tamaño de numeroidnodo"+numeroIDNodo.size());
        boolean[] marcados = new boolean[numeroIDNodo.size()]; //Creamos un vector booleano, para saber cuales están marcados
        //int verticee=numeroIDNodo.get(0).getN();
        String vertice = Integer.toString(numeroIDNodo.get(0).getN()); //Le introducimos un nodo aleatorio, o el primero
        
//        JOptionPane.showMessageDialog(null,"Estas imprimiendo el tamaño de matriz de alg prim"+Matriz.length);
        return AlgPrim(Matriz, marcados, vertice, new double[Matriz.length][Matriz.length]); //Llamamos al método recursivo mandándole 
        
    
    }                                                                                     //un matriz nueva para que en ella nos 
                                                                                          //devuelva el árbol final
    private double[][] AlgPrim(double[][] Matriz, boolean[] marcados, String vertice, double[][] Final) {
       
        ArrayList<String> arrayListAux = new ArrayList<String>(numeroIDNodo.size());
        String aux2;
       // int entero = Integer.parseInt(vertice);
       //JOptionPane.showMessageDialog(null,"Estas llamando el alg prim 2\n"+"El valor de vertice es  "+vertice);
       for(int g=0;g<numeroIDNodo.size();g++){
           aux2=Integer.toString(numeroIDNodo.get(g).getN());
           arrayListAux.add(aux2);
       }
        marcados[arrayListAux.indexOf(vertice)] = true;//marcamos el primer nodo
        double aux = -1;
        if (!TodosMarcados(marcados)) { //Mientras que no todos estén marcados
            for (int i = 0; i < marcados.length; i++) { //Recorremos sólo las filas de los nodos marcados
                if (marcados[i]) {
                    for (int j = 0; j < Matriz.length; j++) {
                        if (Matriz[i][j] != 0) {        //Si la arista existe
                            if (!marcados[j]) {         //Si el nodo no ha sido marcado antes
                                if (aux == -1) {        //Esto sólo se hace una vez
                                    aux = Matriz[i][j];
                                } else {
                                    aux = Math.min(aux, Matriz[i][j]); //Encontramos la arista mínima
                                }
                            }
                        }
                    }
                }
            }
            //Aquí buscamos el nodo correspondiente a esa arista mínima (aux)
            for (int i = 0; i < marcados.length; i++) {
                if (marcados[i]) {
                    for (int j = 0; j < Matriz.length; j++) {
                        if (Matriz[i][j] == aux) {
                            if (!marcados[j]) { //Si no ha sido marcado antes
                                Final[i][j] = aux; //Se llena la matriz final con el valor
                                Final[j][i] = aux;//Se llena la matriz final con el valor
                                
                                
                                //int cade=numeroIDNodo.get(j).getN();
                               String cade=Integer.toString(numeroIDNodo.get(j).getN());
                                //numeroIDNodo.get(0).getN()
                                return AlgPrim(Matriz, marcados, cade, Final); //se llama de nuevo al método con
                                                                                               //el nodo a marcar
                            }
                        }
                    }
                }
            }
        }
        return Final;
    }
    public boolean TodosMarcados(boolean[] vertice) { //Método para saber si todos están marcados
        for (boolean b : vertice) {
            if (!b) {
                return b;
            }
        }
        return true;
    }
    
     public int TamañoMatriz(){
        return numeroIDNodo.size();
    }
    
    public String[][] GenerarMatriz(){
        String A[][]=new String[TamañoMatriz()][TamañoMatriz()];
        for (int i=0;i<TamañoMatriz();i++){
           for(int j=0;j<TamañoMatriz();j++){
               A[i][j]="0";
           }
            
        }
        for (int i=0;i<TamañoMatriz();i++){
            String Peso= Integer.toString(matriz.get(i).getPeso());
            A[matriz.get(i).nodoUno()][matriz.get(i).nodoDos()]=Peso;
            
        }
//         for (int i=0;i<TamañoMatriz();i++){
//           for(int j=0;j<TamañoMatriz();j++){
//               System.out.println("matriz\n"+A[i][j]);
//           }
//            
//        }
       return A;
    }
    public String[][] GenerarMatrizGND(){
        String A[][]=new String[TamañoMatriz()][TamañoMatriz()];
        for (int i=0;i<TamañoMatriz();i++){
           for(int j=0;j<TamañoMatriz();j++){
               A[i][j]="0";
           }
            
        }
        for (int i=0;i<TamañoMatriz();i++){
            String Peso= Integer.toString(matriz.get(i).getPeso());
            A[matriz.get(i).nodoUno()][matriz.get(i).nodoDos()]=Peso;
            A[matriz.get(i).nodoDos()][matriz.get(i).nodoUno()]=Peso;
            
        }
//         for (int i=0;i<TamañoMatriz();i++){
//           for(int j=0;j<TamañoMatriz();j++){
//               System.out.println("matriz\n"+A[i][j]);
//           }
//            
//        }
       return A;
    }
    
    public double[][] GenerarMatrizGNDPrim(){
        double A[][]=new double[TamañoMatriz()][TamañoMatriz()];
        double infinito = Double.POSITIVE_INFINITY;
        double cero =0;
        for (int i=0;i<TamañoMatriz();i++){
           for(int j=0;j<TamañoMatriz();j++){
               A[i][j]=infinito;
           }
            
        }
           for(int k=0;k<TamañoMatriz();k++){
               A[k][k]=cero;
           }
            
        
        for (int l=0;l<TamañoMatriz();l++){
            double Peso= matriz.get(l).getPeso();
            A[matriz.get(l).nodoUno()][matriz.get(l).nodoDos()]=Peso;
            A[matriz.get(l).nodoDos()][matriz.get(l).nodoUno()]=Peso;
            
        }
//         for (int o=0;o<TamañoMatriz();o++){
//           for(int p=0;p<TamañoMatriz();p++){
//               System.out.println("matrizzzz de prim\n"+A[o][p]);
//           }
//            
//        }
       return A;
    }
    
    
     public  static  ArrayList<ArrayList<Double>> matrizDeCostos() {

        //if (nodos.isEmpty()) {
        int fin = nodo.size();
        int finaux=fin*fin;
        double[] numeros = new double[finaux];
        //System.out.println(fin);
        
        int n = 0;
        boolean bandera = true;
        ArrayAux.clear();
        ArrayL = ArrayAux;
         System.out.println("valor de nodo= "+fin+"  Valor de matriz= "+matriz.size());
        System.out.println("\n" + "--------------------");
        for (int i = 0; i < fin; i++) {
            ArrayL.add(new ArrayList<Double>());
            for (int j = 0; j < fin; j++) {
                //ArrayL.get(i).add(matriz.get(n).getPeso());
                for (int k = 0; k < matriz.size(); k++) {
                    if (i == matriz.get(k).nodoUno() && j == matriz.get(k).nodoDos() && i != j) {
                        //System.out.print(matriz.get(k).getPeso() + "  ");
                        n = k;
                        bandera = false;
                        //break;
                    }
                }
                if (bandera) {
                    ArrayAux.get(i).add(0.0);
                    numeros[i]=0.0;
                    System.out.print(" #  ");
                } else {
                    double r;
                    int q;
                    
                    r = (q = matriz.get(n).getPeso()) * 1.0;
                    numeros[i]=r;
                    ArrayAux.get(i).add(r );
                    System.out.print(matriz.get(n).getPeso() + "  ");
                    bandera = true;
                }
            }System.out.println();
        }
        System.out.println("\n" + "--------------------");
        ArrayL = ArrayAux;
        //ArrayAux.clear();
        return ArrayL;
        //  }
    }
     public  static  double [] MC() {

        //if (nodos.isEmpty()) {
        int fin = nodo.size();
        int finaux=fin*fin;
        double[] numeros = new double[finaux];
        //System.out.println(fin);
        
        int n = 0;
        boolean bandera = true;
        ArrayAux.clear();
        ArrayL = ArrayAux;
         System.out.println("valor de nodo= "+fin+"  Valor de matriz= "+matriz.size());
        System.out.println("\n" + "--------------------");
        for (int i = 0; i < fin; i++) {
            ArrayL.add(new ArrayList<Double>());
            for (int j = 0; j < fin; j++) {
                //ArrayL.get(i).add(matriz.get(n).getPeso());
                for (int k = 0; k < matriz.size(); k++) {
                    if (i == matriz.get(k).nodoUno() && j == matriz.get(k).nodoDos() && i != j) {
                        //System.out.print(matriz.get(k).getPeso() + "  ");
                        n = k;
                        bandera = false;
                        //break;
                    }
                }
                if (bandera) {
                    ArrayAux.get(i).add(0.0);
                    numeros[i]=0.0;
                    System.out.print(" #  ");
                } else {
                    double r;
                    int q;
                    
                    r = (q = matriz.get(n).getPeso()) * 1.0;
                    numeros[i]=r;
                    ArrayAux.get(i).add(r );
                    System.out.print(matriz.get(n).getPeso() + "  ");
                    bandera = true;
                }
            }System.out.println();
        }
        System.out.println("\n" + "--------------------");
        ArrayL = ArrayAux;
        //ArrayAux.clear();
        return numeros;
        //  }
    }
     
   
    public void matrizDeCostosND() {

        //if (nodos.isEmpty()) {
        int fin = nodo.size();

        System.out.println(fin);

        int n = 0;
        boolean bandera = true;

        System.out.println("\n" + "--------------------");
        for (int i = 0; i < fin; i++) {

            for (int j = 0; j < fin; j++) {

                for (int k = 0; k < matriz.size(); k++) {

                    if (i == matriz.get(k).nodoUno() && j == matriz.get(k).nodoDos() && i != j) {

                        //System.out.print(matriz.get(k).getPeso() + "  ");
                        n = k;
                        bandera = false;
                        //break;

                    }

                    if (j == matriz.get(k).nodoUno() && i == matriz.get(k).nodoDos() && i != j) {

                        //System.out.print(matriz.get(k).getPeso() + "  ");
                        n = k;
                        bandera = false;
                        //break;

                    }

                }

                if (bandera) {

                    System.out.print(" #  ");

                } else {
                    System.out.print(matriz.get(n).getPeso() + "  ");
                    bandera = true;

                }

            }

            System.out.println();

        }
        System.out.println("\n" + "--------------------");

        //  }
    }

    public int nNodoC(Point p) {

        for (int i = 0; i < circulos.size(); i++) {

            Ellipse2D r = (Ellipse2D) circulos.get(i);
            if (r.contains(p)) {
                return i;
            }
        }

        return -1;
    }

    public int nArista(int n) {

        for (int k = 0; k < arista.size(); k++) {
            Ellipse2D r = (Ellipse2D) circulos.get(n);
            if (r.getX() == arista.get(k).linea().getX1() && r.getY() == arista.get(k).linea().getY1()) {

                return k;
            }

        }

        return -1;
    }

    public void nAristaM(int n) {

        for (int k = 0; k < arista.size(); k++) {
            if (nodos.get(n).getX() == arista.get(k).linea().getX1() && nodos.get(n).getY() == arista.get(k).linea().getY1()) {
                System.out.println("SI ESTA ENTRANDO ");
                tamano.add(k);
            }
        }

    }

    public int setCurrent(int n, double x, double y) {

        for (int i = 0; i < circulos.size(); i++) {

            Ellipse2D r = (Ellipse2D) circulos.get(i);

            if (n == i) {
                r.setFrame(
                        x,
                        y,
                        dimSide, dimSide);
            }

        }

        return -1;
    }

    public void setCurrent(int n, Point p) {
        double x = p.getX();
        double y = p.getY();
        Ellipse2D r = (Ellipse2D) circulos.get(n);
        r.setFrame(
                x - (dimSide / 2),
                y - (dimSide / 2),
                dimSide, dimSide);

    }

    public Ellipse2D find(Point2D p) {

        for (int i = 0; i < circulos.size(); i++) {
            Ellipse2D r = (Ellipse2D) circulos.get(i);
            if (r.contains(p)) {
                return r;
            }
        }
        return null;
    }

    public void posicion(Point2D p) {

        current = new Ellipse2D.Double(p.getX() - (dimSide / 2), p.getY() - (dimSide / 2), dimSide, dimSide);

        circulos.add(current);

        /* nodos.add(new Ellipse2D.Double(p.getX() - (dimSide / 2), p.getY() - (dimSide / 2), dimSide, dimSide));*/
        repaint();
    }

    public void limpiar() {
        matriz.clear();
        circulos.clear();
        nodo.clear();
        arista.clear();
        statusA = false;
        nodoTemp = 0;
        contadorLineas = 0;
        conta = 0;
        mover = 0;
        nodoN = -1;
        current = null;
        currenttemp = null;

        seleccion = false;

    }

    public void pesoManual(boolean pM) {

        matriz.clear();
        circulos.clear();
        nodo.clear();
        arista.clear();
        statusA = false;
        nodoTemp = 0;
        contadorLineas = 0;
        conta = 0;
        mover = 0;
        nodoN = -1;
        current = null;
        currenttemp = null;
        seleccion = false;
        pesoManual = pM;

    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Point primero;
        Point segundo;
        Graphics2D g2 = (Graphics2D) g;

        /**
         * ************************LINEAS****************************
         */
        int dist = 15;
        Polygon poligono1 = new Polygon();
        for (int k = 0; k < arista.size(); k++) {

            g2.setColor(Color.black);
            //g2.setStroke(new BasicStroke(1.2f));
            g2.draw(arista.get(k).linea());
            //  pos1 = (int)((arista.get(k).linea().getX1()+arista.get(k).linea().getX2())/2)-20/2;
            //pos2 =  (int)((arista.get(k).linea().getY1()+arista.get(k).linea().getY2())/2)-20/2;
            g2.setColor(Color.RED);
            //g2.setStroke(new BasicStroke(1.2f));
            if (!pesoManual) {
                g2.drawString(Integer.toString(arista.get(k).distancia()), (int) (arista.get(k).linea().getX1() + arista.get(k).linea().getX2()) / 2 + 10, (int) (arista.get(k).linea().getY1() + arista.get(k).linea().getY2()) / 2 + 10);
            } else {
                g2.drawString(Integer.toString(arista.get(k).getPeso()), (int) (arista.get(k).linea().getX1() + arista.get(k).linea().getX2()) / 2 + 10, (int) (arista.get(k).linea().getY1() + arista.get(k).linea().getY2()) / 2 + 10);
            }
            //  primero = new Point((int) arista.get(k).puntoM().getX() - 10, (int) arista.get(k).puntoM().getY() - 10);
            //  segundo = new Point((int) arista.get(k).puntoM().getX() - 10, (int) arista.get(k).puntoM().getY() + 10);
            if (menuOp) {
                Point punto1 = new Point((int) arista.get(k).linea().getX1(), (int) arista.get(k).linea().getY1());
                Point punto2 = new Point((int) arista.get(k).puntoM().x, (int) arista.get(k).puntoM().y);

                /*g2.setColor(Color.BLACK);
            g2.draw(new Line2D.Double(primero, arista.get(k).puntoM()));
            g2.draw(new Line2D.Double(segundo, arista.get(k).puntoM()));*/
                double ty = -(punto1.y - punto2.y) * 1.0;
                double tx = (punto1.x - punto2.x) * 1.0;
                //angulo
                double ang = Math.atan(ty / tx);

                if (tx < 0) {// si tx es negativo aumentar 180 grados
                    ang += Math.PI;
                }

                //puntos de control para la punta
                //p1 y p2 son los puntos de salida
                Point p1 = new Point(), p2 = new Point(), punto = punto2;

                //angulo de separacion
                double angSep = 20.0;

                p1.x = (int) (punto.x + dist * Math.cos(ang - Math.toRadians(angSep)));
                p1.y = (int) (punto.y - dist * Math.sin(ang - Math.toRadians(angSep)));
                p2.x = (int) (punto.x + dist * Math.cos(ang + Math.toRadians(angSep)));
                p2.y = (int) (punto.y - dist * Math.sin(ang + Math.toRadians(angSep)));

                // Graphics2D g2D=(Graphics2D)g;
                //dale color a la linea
                // grosor de la linea
                //g2D.setStroke (new BasicStroke(1.2f));
                //dibuja la linea de extremo a extremo
                //g.drawLine (punto1.x,punto1.y,punto.x,punto.y);
                //dibujar la punta
                int valoresX[] = {p1.x, punto.x, p2.x};
                int valoresY[] = {p1.y, punto.y, p2.y};

                /* if (arista.get(k).distancia() > 1) {
                g2.setStroke(new BasicStroke(1.2f));
                g.drawLine(p1.x, p1.y, punto.x, punto.y);
                g.drawLine(p2.x, p2.y, punto.x, punto.y);

            }*/
                poligono1 = new Polygon(valoresX, valoresY, 3);
                g2.setColor(Color.BLACK);
                g2.fillPolygon(poligono1);
            }
        }

        for (int i = 0; i < nodo.size(); i++) {

            if (seleccion) {
                g2.setColor(Color.black);
                g2.draw(recuadro);
            }

            g2.setColor(new Color(102, 102, 254));
            //g2.fill(nodos.get(i));
            g2.fill(new Ellipse2D.Double(nodo.get(i).getPunto().getX(), nodo.get(i).getPunto().getY(), dimSide, dimSide));

            g2.setColor(Color.black);

            g2.drawString(Integer.toString(i), (int) nodo.get(i).getPunto().getX(), (int) nodo.get(i).getPunto().getY());
        }
        /*int valoresX[] = {100,200,300};
        int valoresY[] = {200,50, 200};
        Polygon poligono1 = new Polygon(valoresX, valoresY, 3);

        g2.fillPolygon(poligono1);*/

        repaint();

    }
    
    // funciones agregadas
    public boolean situacion_pantalla(){
        if(nodo.isEmpty() == false && arista.isEmpty() == false){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Nodo> Nodos(){
        return nodo;
    }
    /*
    public void tamano_panel(int x,int y){
        alto = y;
        largo = x;
    }*/
}
