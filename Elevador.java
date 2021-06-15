
import java.util.*;
 //author Fausto Mendez Peralta
public class Elevador {

    public static void main(String args[]) {
        Scanner read = new Scanner (System.in);
        String estado;
        int PisoNuevo = 1, PisoActual = 1;
        boolean x = true;
        estado = "DETENIDO";
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("");
        System.out.println("Una   Máquina  de   Estado   Finito, es  llamada   también");
        System.out.println("Autómata  Finito  es  una  abstracción  computacional  que");
        System.out.println("describe el comportamiento de un sistema reactivo mediante");
        System.out.println("un  número determinado  de Estados y un número determinado");
        System.out.println("de Transiciones entre dicho Estados.");
        System.out.println("");
        System.out.println("Un  ejemplo en la vida real es el centro de control  de un");
        System.out.println("ascensor,  pues  tiene solo tres  estados, detenido, subir");
        System.out.println("y bajar, tomando este ejemplo codifique un simulador  para");
        System.out.println("poder obnservar el funcionamiento aplicado de  una maquina");
        System.out.println("de estado finito en la vida diaria");
        while(x){
            switch(estado){
                case "DETENIDO"://esto es lo que se realiza cada que el elevador se detiene
                 System.out.println("");
                 System.out.println("----------------------------------------------------------");
                       System.out.println("Ingrese 0 para salir");
                 System.out.println("Detenido en piso: "+ PisoActual);//nuestro elevador nos dira en que piso se encuentra detenido, por default esta en el piso 1
                  System.out.println("----------------------------------------------------------");
                 System.out.println("");
                 System.out.println("Indique el piso al que desea ir: ");
                PisoNuevo = read.nextInt(); //Se elige el piso al que se desea ir
                if(PisoNuevo == 0){ //aqui si el usario ingresa 0 "Apaga el elevador", ya que el piso 0 no existe
                    x=false;
                }
                if(PisoNuevo > PisoActual){
                    estado = "Subiendo";  //si el piso ingresado es mayor al cual se encontraba, el elevador comenzara a ascender
                }else{if(PisoNuevo < PisoActual){ estado = "Bajando";}}// si es menor desciende 
                break;
                case "Subiendo":
                System.out.println("");
                System.out.println("Subiendo . . . . .");//si el piso fue mayor se le avisa al usuario que esta ascendiendo
                PisoActual = PisoNuevo;
                if (PisoNuevo == PisoActual){estado = "DETENIDO";}// al llegar al piso de destino, este cambia a estar detenido
                break;
                case "Bajando":
                 System.out.println("");
                 System.out.println("Bajando . . . . .");//si el piso fue menor se le avisa al usuario que esta descendiendo
                PisoActual = PisoNuevo;
                if(PisoNuevo == PisoActual){estado = "DETENIDO";}// al llegar al piso de destino, este cambia a estar detenido
                break;// se vuelve a repetir 
            }
        }
    }
}
