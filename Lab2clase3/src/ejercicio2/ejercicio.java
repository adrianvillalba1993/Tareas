package ejercicio2;

/**
 * Created by VillalbaAdrian on 15/8/2019.
 */
import javax.swing.JOptionPane;
//ejercicio de la clase 3 de laboratorio2
public class ejercicio {
    public static void main(String[]args){
        int[][] matriz = new int[3][3];

        for(int i=0;i<3;i++) {
          for(int j=0;j<3;j++) {
           matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog("ingresar valor"));
          }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }

    }

}
