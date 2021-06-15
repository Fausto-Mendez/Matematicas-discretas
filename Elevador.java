
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
                case "DETENIDO":
                 System.out.println("");
                 System.out.println("----------------------------------------------------------");
                       System.out.println("Ingrese 0 para salir");
                 System.out.println("Detenido en piso: "+ PisoActual);
                  System.out.println("----------------------------------------------------------");
                 System.out.println("");
                 System.out.println("Indique el piso al que desea ir: ");
                PisoNuevo = read.nextInt(); //Se elige el piso
                if(PisoNuevo == -1 || PisoNuevo == 0){
                    x=false;
                }
                if(PisoNuevo > PisoActual){
                    estado = "Subiendo";
                }else{if(PisoNuevo < PisoActual){ estado = "Bajando";}}
                break;
                case "Subiendo":
                System.out.println("");
                System.out.println("Subiendo . . . . .");
                PisoActual = PisoNuevo;
                if (PisoNuevo == PisoActual){estado = "DETENIDO";}
                break;
                case "Bajando":
                 System.out.println("");
                 System.out.println("Bajando . . . . .");
                PisoActual = PisoNuevo;
                if(PisoNuevo == PisoActual){estado = "DETENIDO";}
                break;
            }
        }
    }
}
