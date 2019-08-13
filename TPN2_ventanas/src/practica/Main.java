package practica;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
    }


    public static void ejercicio1(){
        int[] arreglo = cargar();
        int mayor=0;
        int menor=0;
        int cero=0;

        for(int i=0;i<10;i++){
            if(arreglo[i] < 0){
                menor++;
            }else if(arreglo[i] > 0){
                mayor++;
            }else if(arreglo[i] == 0){
                cero++;
            }
        }
        JOptionPane.showMessageDialog(null,"la cantidad de numeros positivos son "+mayor+"\n"+
                "la cantidad de numeros negativos son "+menor+"\n"+"la cantidad de numeros iguales a cero son "+cero+"\n");
    }

    public static void ejercicio2(){
        int[] arreglo = cargar();
        int acum = 0;
        float resu = 0;
        for(int i=0;i<10;i+=2){
            acum = acum+arreglo[i];
        }
        resu= acum%5;

        JOptionPane.showMessageDialog(null,"la media de valores es "+resu);
    }

    public static int[] cargar(){
        int[] arreglo = new int[10];
        for(int i=0;i<10;i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor:"));
        }
        return arreglo;
    }


}
