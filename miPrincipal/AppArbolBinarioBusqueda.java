package miPrincipal;

import java.util.Scanner;
import arbolBinarioOrdenado.ArbolBinario;
import arbolBinarioOrdenado.Entero;
import arbolBinarioOrdenado.BTreePrinter;

public class AppArbolBinarioBusqueda{
    public static void menu(){
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println();
            System.out.println("********************************");
            System.out.println("       ARBOLES BINARIOS         ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.println("Selecciona opción:");
            
            opc=consola.nextInt();
            switch(opc){
                case 1:
                    insertarNodo();
                    break;

                case 2:
                case 3:
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                   System.out.println("Opcion inválida");

            }
        } while (opc != 0);
    }
    public static void insertarNodo(){
        ArbolBinario arbol = new ArbolBinario();
        try{
           
            arbol.insertar2(new Entero(10));
            arbol.insertar2(new Entero(15));
            arbol.insertar2(new Entero(30));
            arbol.insertar2(new Entero(5));
            arbol.insertar2(new Entero(2));
            arbol.insertar2(new Entero(1));

        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        System.out.println("RECORRIDO DE ARBOLES:");
        System.out.println("\n Recorrido Inorden");
        arbol.inorden();
        System.out.println("\n Recorrido Preorden");
        arbol.preorden();
        System.out.println("\n Recorrido Postorden");
        arbol.postorden();
        //Imprime el arbol depues de la inserción
        System.out.println("IMPRESION DEL ARBOL:");
        BTreePrinter.printNode(arbol.getRaiz());

    }
}