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

//EN UNA COLA SOLAMENTE INSERTAMOS Y RETIRAMOS
public class Cola<T> {
	
	private ListaLigada<T> cola = new ListaLigada<T>();
    
    public void insertar(T dato){
        cola.insertarFinal(dato);
    }
    
    public T retirar(){
        return cola.eliminaInicio();
    }
}
