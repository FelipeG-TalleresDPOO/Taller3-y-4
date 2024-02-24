package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

/**
* 21 Feb 2024  * @author          
Felipe Gaitan */
public class Tiquete {

	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente clienteComprador;
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.vuelo = vuelo;
		this.clienteComprador = clienteComprador;
	}
	
	public Cliente getCliente() {
		return clienteComprador;
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public int getTarifa() {
		return tarifa;
	}
	
	public void marcarComoUsado() {
		usado = true;
	}
	
	public boolean esUsado() {
		return usado;
	}
}
