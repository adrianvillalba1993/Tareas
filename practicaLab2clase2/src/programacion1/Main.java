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
    }
}
