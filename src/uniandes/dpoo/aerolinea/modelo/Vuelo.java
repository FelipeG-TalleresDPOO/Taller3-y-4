package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;



/**
 *  
        Esta clase tiene la información de un vuelo particular que cubre una ruta y se lleva a cabo en una cierta fecha.
 *
 * 		21 Feb 2024  * @author          
        Felipe Gaitan  */

public class Vuelo {

	private String fecha;
	private Avion avion;
	private Ruta ruta;
	
    
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
	}
	
	public Ruta getRuta() {
		return ruta;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public Avion getAvion() {
		return avion;
	}
	
	public Collection<Tiquete> getTiquetes(){
		
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		
	}
	
	public boolean equals(Object obj) {
		
	}
	
}

