package persistencia.memoria;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import modelo.Colega;


public class BaseDeDatos {

private Map<Integer, Colega> tablaColegas = null;
	
	public void createTablaLibros(){
		tablaColegas = new HashMap<>();
	}
	
	public void insertarUnColega(Colega colega){
		tablaColegas.put(colega.getId(), colega);
	}
	
	public void borrarUnColegaPorId(int id){
		tablaColegas.remove(id);
	}
	
	
	public void modificarUnColega(Colega colega){
		this.insertarUnColega(colega);
	}
	
	public Colega consultarUnColegaPorId(int id){
		
		return tablaColegas.get(id);
	}	
	
	public Collection<Colega> consultarTodosLosColegas(){
		return tablaColegas.values();
	}
	
	
}
