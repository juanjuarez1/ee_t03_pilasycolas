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
// ESTA CLASE TIENE SUS METODOS PUSH, POP Y PEEK (AGREGAR, BORRAR Y VER)
  public class Pila<T> {
	
	public ListaLigada<T> pila = new ListaLigada<T>();
    
               public void push(T dato){
        pila.insertarFinal(dato);
    }
    
    public T pop(){
        return pila.eliminaFinal();
    }
    
   public T peek(){
               ee_t03_pilasycolas.Nodo<T> tempo = pila.getInicio();
        if(tempo == null)
           return null;
           
  try{
      
            while(tempo.getSiguiente() != null)
                  tempo = tempo.getSiguiente();
        }
  catch(NullPointerException e){
            System.out.println("Lista vacía");
            
        }
        return tempo.getDato();
    }
    
    public boolean Vacia(){
        return pila.getInicio() == null;
    }
}
