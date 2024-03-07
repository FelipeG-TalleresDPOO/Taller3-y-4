package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.Collection;
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
	public abstract String getIdentificador() ;
	public  void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	public  int calcularValorTotalTiquetes() {
		int ValorTotalHistorico = 0;
		for (Tiquete tiquete: tiquetesUsados) {
			int valorTiquete = tiquete.getTarifa();
			ValorTotalHistorico =+ valorTiquete;
			
		}for (Tiquete tiquete: tiquetesSinUsar) {
			int valorTiquete = tiquete.getTarifa();
			ValorTotalHistorico =+ valorTiquete;
		}
		return ValorTotalHistorico;
	}
	public  void usarTiquetes(Vuelo vuelo) {
		Collection<Tiquete> tiquetes = vuelo.getTiquetes();
		for (Tiquete tiquete : tiquetes) {
			Cliente cliente = tiquete.getCliente();
			String id = cliente.getIdentificador();
			if (id == this.getIdentificador()) {
				tiquetesUsados.add(tiquete);
				tiquetesSinUsar.remove(tiquete);
			}
		}
	}
}