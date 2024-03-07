package uniandes.dpoo.aerolinea.modelo.tarifas;


import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;


public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

	protected int COSTO_POR_KM = 1000;
	
	
	@Override
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		int costoBase;
		Ruta ruta = vuelo.getRuta();
		int distancia = calcularDistanciaVuelo(ruta);
		costoBase = COSTO_POR_KM * distancia;
		return costoBase;
	}
	
	
	
	@Override
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}
	
		
	
	
}
