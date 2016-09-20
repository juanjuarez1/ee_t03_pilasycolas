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
import java.io.*;

public class Test {
	
	Pila<String> pila = new Pila<String>(); 
        Cola<String> cola = new Cola<String>();
	
	// ESTE METODO LEE EL ARCHIVO datos.txt QUE SON DE LA PILA
        
        public void archivo(){		
		
		File file = new File("datos.txt");
		try{
	BufferedReader in = new BufferedReader(new FileReader(file));
	String cad;
	cad = in.readLine(); 
		if(cad.equals("0")){ 
                    System.out.println("Datos de Pila:");
		cad = in.readLine(); 
		while(cad != null){

			if(cad.substring(0,1).equals("0"))
			pila.push(cad.substring(2,3));
			else{
			if(cad.equals("1")) 
System.out.println(pila.pop());
			else
	if(cad.equals("2")) 
			System.out.println(pila.peek());
				else
System.out.println("No existe la instrucción.");
		}
			cad = in.readLine(); 
				}		
				in.close(); 
			}
		}
                
                
                
                
    catch (FileNotFoundException e1) {
		 System.err.println("El archivo: " + file + " no se creo ");
	    } 
          catch (IOException e2){  
	      e2.printStackTrace();
	    }
	}
	// ESTE METODO LEE EL ARCHIVO datos2.txt DE UNA COLA
	public void archivo2(){
		
		File file = new File("datos2.txt");
		try{
	BufferedReader in = new BufferedReader(new FileReader(file));
			String cad2;
			cad2 = in.readLine(); 
	if(cad2.equals("1")){ 
		System.out.println("Datos de Cola:");
cad2 = in.readLine(); 
	while(cad2 != null){
            
		if(cad2.substring(0,1).equals("0")) 
						
	cola.insertar(cad2.substring(2,3));
					else
		if(cad2.equals("1"))
							
				System.out.println(cola.retirar());
					cad2 = in.readLine(); 
				}
	in.close(); 
			}
		}
                
                
                
                
                
                
                catch (FileNotFoundException e1) {
		      System.err.println("El archivo: " + file + " no se creo");
	    } 
                catch (IOException e2){
	      e2.printStackTrace();
	    }
	}
	 public static void main(String[] args){
		Test leer = new Test();
		
		leer.archivo();
		System.out.println();
		leer.archivo2();
		
	}
}

