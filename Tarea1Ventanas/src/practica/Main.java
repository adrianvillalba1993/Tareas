package practica;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String nombre;
        int edad = 1;

        do {
            nombre = JOptionPane.showInputDialog("ingrese nombre:");

            edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese edad:"));
            if(edad == 0){
                JOptionPane.showMessageDialog(null,"Decide terminar el programa");
                System.exit(0);
            }else if(edad < 0){
                JOptionPane.showMessageDialog(null,"La edad no puede ser menor a cero");
                continue;
            }

            if(edad > 18){
                JOptionPane.showMessageDialog(null,"su nombre es "+nombre+" y es mayor de edad");
            }else if(edad < 18){
                JOptionPane.showMessageDialog(null,"su nombre es "+nombre+" y es menor de edad");
            }else{
                JOptionPane.showMessageDialog(null,"su nombre es "+nombre+" y tiene "+edad+" años");
            }
        }while(edad != 0);


    }

}
