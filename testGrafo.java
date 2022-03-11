/**
 *
 * @author Yalu
 *  2011
 *
 */
public class testGrafo {
    public static void main(String []args){

        Grafo g = new Grafo(6);

        g.agregaVertice("1");
        g.agregaVertice("2");
        g.agregaVertice("3");
        g.agregaVertice("4");
        g.agregaVertice("5");
        g.agregaVertice("6");
        g.agregaVertice("7");
        g.agregaVertice("8");
        g.agregaVertice("9");

	g.mostrarVertices();

        g.agregaArista("1", "2",8);
        g.agregaArista("2", "1",8);
        g.agregaArista("1", "4",15);
        g.agregaArista("4", "1",15);
        g.agregaArista("1", "5",7);
        g.agregaArista("5", "1",7);
        
        g.agregaArista("2", "5",5);
        g.agregaArista("5", "2",5);
        g.agregaArista("2", "6",34);
        g.agregaArista("6", "2",34);
        g.agregaArista("2", "8",12);
        g.agregaArista("8", "2",12);
        
        g.agregaArista("6", "3",11);
        g.agregaArista("3", "6",11);
        g.agregaArista("6", "9",74);
        g.agregaArista("9", "6",74);
        g.agregaArista("6", "8",7);
        g.agregaArista("8", "6",7);
        
        g.agregaArista("3", "9",98);
        g.agregaArista("9", "3",98);
        
        g.agregaArista("9", "5",8);
        g.agregaArista("5", "9",8);
        
        g.agregaArista("5", "4",10);
        g.agregaArista("4", "5",10);
        g.agregaArista("5", "7",15);
        g.agregaArista("7", "5",15);
        
        g.agregaArista("4", "7",20);
        g.agregaArista("7", "4",20);
        
        
        g.mostrarMatriz();

        Grafo g2 = new Grafo(6);
        g2.agregaVertice("A");
        g2.agregaVertice("B");
        g2.agregaVertice("C");
        g2.agregaVertice("D");
        g2.agregaVertice("E");
        g2.agregaVertice("F");
        
        g2.mostrarVertices();
        
        g2.agregaArista("A", "E");
        g2.agregaArista("A", "F");
        g2.agregaArista("B", "A");
        g2.agregaArista("B", "C");
        g2.agregaArista("C", "D");
        g2.agregaArista("D", "A");
        g2.agregaArista("D", "B");
        g2.agregaArista("D", "D");
        g2.agregaArista("E", "C");
        g2.agregaArista("E", "F");
        g2.agregaArista("F", "E");
        
        g2.mostrarMatriz();
    }
}
