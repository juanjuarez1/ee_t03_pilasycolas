/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;

/**
 *
 * @author JUAN ANTONIO JUAREZ OLIVERA
 */
public class ListaLigada<T>{
	
    private Nodo<T> inicio;
       
    public ListaLigada(){
    	inicio = null;
    }
    public Nodo<T> getInicio(){
        return inicio;
    }
    
    //))METODOS DE LA CLASE J
    public void insertarInicio(T dato){
        Nodo<T> nuevo = new Nodo<T>(dato);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }
    
    public void insertarFinal(T dato){
        Nodo<T> tempo = inicio;
        if(inicio == null)
           insertarInicio(dato);
        else{
             while(tempo.getSiguiente() != null)
                   tempo = tempo.getSiguiente();
             tempo.setSiguiente(new Nodo<T>(dato));
        }        
    }
    
    
    public T eliminaFinal(){
        Nodo<T> tempo = inicio, ant = null;
        try{
            
            if(inicio.getSiguiente() == null)
               inicio = null;
               else{
                
     while(tempo.getSiguiente() != null){
               ant = tempo;
                       tempo = tempo.getSiguiente();
                    }  
                   
                    ant.setSiguiente(null);
            }     
        }
        catch(NullPointerException e){
            System.out.println("Lista vacía");
        }
        return tempo.getDato();
    }
    
    public T eliminaInicio(){
        Nodo<T> tempo = inicio;
        try{
            if(tempo.getSiguiente() != null)
                inicio = tempo.getSiguiente();
                else
                inicio = null;
        }
        
        catch(NullPointerException e){
            System.out.println("Lista vacía");
            
        }
        
        return tempo.getDato();
    }
    public void recorrer(){
    	Nodo<T> tempo = inicio;
    	while(tempo != null){
    		System.out.print(tempo.getDato() + "-->");
    		tempo = tempo.getSiguiente();
    	}
    	System.out.print("null");
    }
 
    public String toString(){
        Nodo<T> iterator = inicio;
        String cad = "";
         while( iterator != null ){ 
             cad += iterator.getDato() + " --> ";
             iterator = iterator.getSiguiente(); 
         } 
         cad += null;
         return cad;
    }
}

