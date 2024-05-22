package miPrincipal;
import java.util.Scanner;
import grafos.matrizAdyacencia.Vertice;
import grafos.matrizAdyacencia.GrafoMatriz;
public class AppGrafos{
    public static void menu(){
        int opc;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("********************************");
            System.out.println("           GRAFOS               ");
            System.out.println("********************************");
            System.out.println("1) Matriz de Adyacencia         ");
            System.out.println("2) Lista de Adyacencia          ");
            System.out.println();
            System.out.println("0) SALIR                        ");
            System.out.println("********************************");
            System.out.print("Selecciona opción:");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                   matrizAdyacencia();
                   break;
                case 2:
                   listaAdyacencia();
                   break;
                case 0:
                   System.out.println("Hasta luego");
                   break;
                default:
                  System.out.println("opción inválida");
            }
        } while(opc !=0);
    }
    public static void matrizAdyacencia(){
        System.out.println("********************************");
        System.out.println("      MATRIZ ADYACENCIA         ");
        System.out.println("********************************");
        

    }
    public static void listaAdyacencia(){
        System.out.println("********************************");
        System.out.println("        LISTA ADYACENCIA        ");
        System.out.println("********************************");

    }
}