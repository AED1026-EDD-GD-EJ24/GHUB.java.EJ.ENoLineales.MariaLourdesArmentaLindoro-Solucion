package miPrincipal;
import arbolAVL.ArbolAVL;
import arbolAVL.Entero;

import arbolAVL.BTreePrinter;

import java.util.Scanner;

public class AppArbolAVL{
    public static void menu(){
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("********************************");
            System.out.println("       ARBOLES AVL              ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.out.println("4) Mostrar árbol               ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.print("Selecciona opción:");

            opc=consola.nextInt();
                switch(opc){
                    case 1:
                       insertarNodo();
                       break;
                    case 2:
                       eliminarNodos();
                       break;
                    case 3:
                        buscarNodo();
                        break;
                    case 4:
                       System.out.println("Opcion inválida");

                    default:

                }
        } while (opc !=0);
    }
    public static void insertarNodo(){
        System.out.println("**** INSERTAR NODOS ****");
        ArbolAVL abo =  new ArbolAVL();
        try{
            //insertar algunos elemento
            abo.insertar(new Entero(2));
            abo.insertar(new Entero(4));
            abo.insertar(new Entero(6));
            //BTreePrinter.printNode(abo.getRaiz());
            abo.getRaiz();
            



        }
        catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }
    public static void eliminarNodos(){
        System.out.println("**** ELIMINAR NODOS ****");

    }
    public static void buscarNodo(){
        System.out.println("**** BUSCAR NODOS ****");
    }


}
