package practica;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String nombre;
        int edad = 1;


        do{
            System.out.println("ingrese su nombre:");
            Scanner teclado = new Scanner(System.in);
            nombre = teclado.nextLine();

            System.out.println("ingrese su edad:");
            edad = teclado.nextInt();
            if(edad == 0){
                System.out.println("decide terminar el programa");
                System.exit(0);
            }else if(edad < 0){
                System.out.println("la edad no puede ser menor a cero");
                continue;
            }

            if(edad > 18){
                System.out.println("su nombre es "+nombre+" y es mayor de edad");
            }else if (edad < 18){
                System.out.println("su nombre es "+nombre+" y es menor de edad");
            }else {
                System.out.println("su nombre es "+nombre+" y tiene "+edad+" años");
            }

        }while(edad !=0);





    }

}
