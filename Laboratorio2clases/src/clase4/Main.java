package clase4;

/**
 * Created by gatoe on 16/8/2019.
 */
//programacion orientada a objetos(OOP)
public class Main {
    public static void main(String[]args){
     /*
        String[][] persona = new String[3][3];

     for(int i=0;i<persona.length;i++){
         for(int j=0;j<persona.length;j++){
           Scanner teclado = new Scanner(System.in);
           if(i == 0){
               System.out.println("ingrese nombre:");
           }else if(i == 1){
               System.out.println("ingrese DNI:");
           }else if(i == 2){
               System.out.println("ingrese edad:");
           }
           persona[j][i] = teclado.nextLine();
         }

     }
        for(int i=0;i<persona.length;i++) {
            for (int j = 0; j < persona.length; j++) {
                System.out.print(persona[j][i]+" ");
            }
            System.out.println(" ");
        }
        */

     Movil nuevo = new Movil("samsung",8000);
     nuevo.setStock(500);
        System.out.println(nuevo.getinfo());
        nuevo.vender();
        System.out.println(nuevo.verStock());
    }
}
