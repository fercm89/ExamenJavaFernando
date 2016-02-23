package persistencia;

import java.util.Collection;

import modelo.Colega;
import persistencia.memoria.BaseDeDatos;

public class MemoriaColegaDao implements ColegaDao {
	
	private BaseDeDatos bd;
	
	public MemoriaColegaDao(BaseDeDatos bd) {
		super();
		this.bd = bd;
	}

	@Override
	public void alta(Colega colega) {
		bd.insertarUnColega(colega);	
	}

	@Override
	public void baja(int id) {
		bd.borrarUnColegaPorId(id);	

	}

	@Override
	public void modifica(Colega colega) {
		bd.modificarUnColega(colega);		
	}

	@Override
	public Colega consulta(int id) {
		return bd.consultarUnColegaPorId(id);
	}

	@Override
	public Collection<Colega> consulta() {
		return bd.consultarTodosLosColegas();
	}

}
