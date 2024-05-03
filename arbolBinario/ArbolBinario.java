package arbolBinario;

import pilas.Pila;
public class ArbolBinario{
    private Nodo raiz;
    public ArbolBinario(){
        this.raiz = null;
    }
    public ArbolBinario(Nodo raiz){
        this.raiz = raiz;
    
    }
    public Nodo getRaiz(){
        return this.raiz;
    }
    public void setRaiz(Nodo raiz){
        this.raiz = raiz;
    }
    private void visitar(Nodo aux){
        System.out.print(aux.getValor() + " ");
    }
    //implementacion de los recorridos
    private void preorden(Nodo aux){
        if (aux != null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());
            
        }
    }
    public void preorden(){
        preorden(this.raiz);
    }
    public void inorden(){
        inorden(raiz);
    }
    private void inorden(Nodo aux){
        if (aux != null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());
        }
    }
    
    //implementacion de los recorridos iterativos
    public void preordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        pila.apilar(raiz);
        while (!pila.esVacia()){
            Nodo aux = pila.cima();
            visitar(aux);
            pila.retirar();
            if(aux.getDerecho() !=null){
                pila.apilar(aux.getDerecho());
            }
            if(aux.getIzquierdo() !=null){
                pila.apilar(aux.getIzquierdo());
            }
            
        }
       
    }

    public void inordenIterativo(){

    }

    
}