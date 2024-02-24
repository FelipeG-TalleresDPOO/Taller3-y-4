package uniandes.dpoo.aerolinea.modelo;

/**
 *  
        En esta clase se organiza la información básica de los aviones que realizan los vuelos
 *
 * 		21 Feb 2024  * @author          
        Felipe Gaitan  */

public class Avion {
	
	// Atributos de la clase Avion
	private String nombre;
	private int capacidad;
	
	// Constructor de la clase Avion
	public Avion (String nombre, int capacidad){
		this.nombre = nombre;
		this.capacidad = capacidad;
	} 
	
	// Método para obtener el nombre del avión
	public String getNombre() {
		return this.nombre;
	}
	
	// Método para obterner la capacidad del avión
	public int getCapacidad() {
		return this.capacidad;
	}
}
