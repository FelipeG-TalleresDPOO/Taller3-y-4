package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;



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
	private Map<String, Tiquete> tiquetes;
	
    
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
		return tiquetes.values();
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException {
		int tarifa = calculadora.calcularTarifa(this, cliente); 
		int precioTotal = tarifa * cantidad;
		int capacidad = avion.getCapacidad();
		int tiquetesVendidos = tiquetes.size();
		
		
        if (tiquetesVendidos + cantidad > capacidad ) {
            throw new VueloSobrevendidoException(this);
            
        }else {
        	for (int i = 0; i < cantidad; i++) {
        		Tiquete nuevoTiquete = GeneradorTiquetes.generarTiquete(this, cliente, tarifa);
        		GeneradorTiquetes.registrarTiquete(nuevoTiquete);
        		tiquetes.put(nuevoTiquete.getCodigo(), nuevoTiquete);
        	}
        }

        return precioTotal;
    }
	
	
	public boolean equals(Object obj) {
		return obj.equals(obj);
	}
	
}

