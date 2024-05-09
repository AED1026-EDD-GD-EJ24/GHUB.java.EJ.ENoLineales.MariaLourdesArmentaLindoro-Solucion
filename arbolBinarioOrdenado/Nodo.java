package arbolBinarioOrdenado;
public class Nodo {
    public Comparable valor;
    public Nodo izquierdo;
    public Nodo derecho;
    
    
    
    
    public Nodo() {
    }
    

    public Nodo(Comparable valor) {
        this.valor = valor;
    }

    public Comparable getValor() {
        return valor;
    }
    public void setValor(Comparable valor) {
        this.valor = valor;
    }
    public Nodo getIzquierdo() {
        return izquierdo;
    }
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }
    public Nodo getDerecho() {
        return derecho;
    }
    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    
}
