package Ventana;


import Grafos.Nodo;
  // import java.util.ArrayList;

//import javax.swing.JOptionPane;

//
public class Dijkstra {
	String new_ruta = "";
	
	public String getNew_ruta() {
		return new_ruta;
	}
	public void setNew_ruta(String new_ruta) {
		this.new_ruta = new_ruta;
	}
	
	
	public String Diskjtra(double [][] mat_adya, int no_nodos, int nod_1, int nod_2) {
		int vertices = no_nodos; 
                //System.out.print(no_nodos);
		//ArrayList<Nodo> nod_aux = new ArrayList<Nodo>(); 
		 
		String camino[][] = new String[vertices][vertices];
		String caminos_aux[][] = new String[vertices][vertices]; 
		String caminoRecorrido = "", cadena= "", caminos_dep_aux = ""; 
		//String nod_1 = "", nod_2 ="";
		String cad_aux_ruta = ""; 
		int i, j, k; 
		double temp1, temp2, temp3, temp4, minium; 
                //System.out.print("hola");
		//Seleccion de nodos 
		//nod_1 = JOptionPane.showInputDialog("Coloca el nodo de origen: ");
		//nod_2 = JOptionPane.showInputDialog("Coloca el nodo de destino: ");
		
		//Inicializar caminos y matrices
		for(i = 0; i<no_nodos; i++) {
				for(j=0; j<no_nodos; j++) {
                                    camino[i][j] = ""; 
                                    caminos_aux[i][j] = "";
                                    /*if(mat_adya[i][j] == 0 && i!= j)
                                        mat_adya[i][j] = Double.POSITIVE_INFINITY;*/
                                     System.out.print(mat_adya[i][j] + " ");
						
				}
                              //  System.out.println();
		}//Fin inicializacion de matrices 
		double mat_pesos [][]= mat_adya;
		
		
		for(k=0; k<no_nodos; k++) {
			for(i = 0; i<no_nodos; i++) {
				for(j=0; j<vertices;j++) {
					temp1 = mat_adya[i][j];
					temp2 = mat_adya[i][k];
					temp3 = mat_adya[k][j];
					temp4 = temp2 +temp3; 
					//Proceso de camino minimo 
					minium = Math.min(temp1, temp4);
					if(temp1!= temp4) {
						if(minium == temp4) {
							caminoRecorrido =""; 
							caminos_aux[i][j] = k + ""; 
							camino[j][i] = caminoR(i, k, caminos_aux, caminoRecorrido) + (k); //Funcion recursiva ya quedo
						}
					}
					mat_pesos[i][j] = minium;//Cast de float a long
				}
			}
		}
		
		//Agregar el camino minimo a la cadena 
		for(i = 0; i<vertices; i++) {
			for(j=0; j<vertices; j++) {
				cadena += "[" + mat_pesos[j][i] + "]";
			}
			cadena +="\n";
		}
		/*----------------------------------------------------------------------*/
		for(i=0; i<vertices; i++) {
			for(j=0; j<vertices; j++) {
				if(mat_pesos[i][j]!= Double.POSITIVE_INFINITY) {
					if(i!=j) {
						if(camino[i][j].equals("")){
							
							caminos_dep_aux += "De [" +(i) +"--->"+ (j) +"] pasa por: [" + (i) +", "+ (j)+ "]*\n";
						}else {
							caminos_dep_aux += "De [" +(i) +"--->" +(j) +"] pasa por: ["+ (i) + ", " +camino[i][j] + ", " + (j)+"]*\n"; 
						}
					}
				}
			}
		}
		 
		//return /*"La Matriz de caminos mas cortos entre los diferentes vertices es: \n" + cadena +*/
		//		"\nLos direfentes caminos mas cortos entre vertices es son:\n" + caminos_dep_aux; 
		
		new_ruta = fun_busque_de_nods(caminos_dep_aux, nod_1, nod_2/*, nod_aux*/);
		
		
		 return new_ruta; 
	}
	//Funcion que busca los nodos 
	public String fun_busque_de_nods(String caminos_dep_aux, int nod_1, int nod_2/*, ArrayList<Nodo> nod_aux*/) {
		String new_string_nodos = ""; 
		String aux_nodos_ruta = ""; 
		boolean contenedor = true; 
		boolean index = true; 
		int index_pala = 0; 
		new_string_nodos = "["+nod_1+"--->"+nod_2+"]";
		System.out.print(new_string_nodos+"\n");
		contenedor = caminos_dep_aux.contains(new_string_nodos); 
		if(contenedor) {
			index_pala = caminos_dep_aux.indexOf(new_string_nodos); 
			while(caminos_dep_aux.charAt(index_pala)!= '*') {
				aux_nodos_ruta+= caminos_dep_aux.charAt(index_pala++);
			}
		}
		
		
		return (aux_nodos_ruta); 
	}
	
	
	
	//Funcion recursiva 
	public String caminoR(int i, int k, String[][] caminos_aux, String camino_recor) {
		if(caminos_aux[i][k].equals("")) {
			return "";
		}else {
			//Recursividad 
			camino_recor+= caminoR(i, Integer.parseInt(caminos_aux[i][k].toString()), caminos_aux, camino_recor)+(Integer.parseInt(caminos_aux[i][k].toString())+1)+", ";
			return camino_recor; 
		}
	}
	
}
