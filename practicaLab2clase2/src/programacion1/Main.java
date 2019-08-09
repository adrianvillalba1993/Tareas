package programacion1;
import javax.swing.plaf.synth.SynthButtonUI;
public class Main {

    public static void main(String[] args) {
        System.out.println("con un for:");
     for(int i = 1; i<=10;i++){
         System.out.print(i+", ");
     }

        System.out.println("");
        System.out.println("con un while:");
     int j = 1;
     while(j <= 10){
         System.out.print(j+", ");
         j +=1;
     }
        System.out.println("");
        arreglos_nombres();
    }
    
    
    public static void arreglos_nombres(){
        String[] matriz = new String[5];


        for(int i = 0;i<5;i++){
            matriz[i] = JOptionPane.showInputDialog("ingresar nombre:");
        }

        for(String nombre:matriz){
            JOptionPane.showMessageDialog(null,"nombre:"+nombre);
        }

    }
}
