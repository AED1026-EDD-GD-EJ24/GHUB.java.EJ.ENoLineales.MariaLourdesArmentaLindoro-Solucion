package interfase;

import arbolBinarioOrdenado.Persona;

public class CriterioPersonaId extends Criterio<Persona>{
    public int comparar(Persona a, Persona b){
        return a.getId()-b.getId();
    }
    
}
