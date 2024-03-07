package uniandes.dpoo.aerolinea.modelo.cliente;


/**
* 21 Feb 2024  * @author          
Felipe Gaitan*/
public class ClienteNatural extends Cliente {
	
	public static String NATURAL = "Natural";
	private String nombre;
	
	public ClienteNatural(String nombre) {
		super( );
		this.nombre = nombre;
	}
	
	public String getIdentificador() {
		return nombre;
	}
	
	public String getTipoCliente() {
		return NATURAL;
		
	}

}
