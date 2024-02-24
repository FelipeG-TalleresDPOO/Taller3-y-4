package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.List;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
/**
* 21 Feb 2024  * @author          
Felipe Gaitan  */
public abstract class Cliente {
	
	private List<Tiquete> tiquetesUsados;
	private List<Tiquete> tiquetesSinUsar;
	
	public Cliente() {}
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {}
	
	public  int calcularValorTotalTiquetes() {
		
	}
	
	public void usarTiquetes(Vuelo vuelo) {}
}
