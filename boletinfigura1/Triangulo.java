
package boletinfigura1;
import javax.swing.JOptionPane;

public class Triangulo {
    private int lineas;
    
    public void pideLineas (){
        lineas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas lineas quieres dibujar?"));
    }
    
    public void dibujaTri(){
        pideLineas();
        int i=1;
        lineas=lineas+1;
        do{
            for (int j=0;j!=i;j++){
                System.out.print("a");
            }
            System.out.println("");
            i++;
        }while(i!=lineas);
    }
}
