package negocio;

import java.sql.SQLException;

import modelo.Colega;
import persistencia.ColegaDao;

public class NegocioColegas implements NegocioColegasInterfaz {

	private ColegaDao colegaDao;
	
	public NegocioColegas(ColegaDao colegaDao) {
		super();
		this.colegaDao = colegaDao;
	}
	
	
	@Override
	public void registroDeColegaEnLaAplicacion(Colega colega) throws SQLException {
		 colegaDao.alta(colega);
	}

	@Override
	public void bajaDeColegaEnLaAplicacion(int loguin) throws SQLException {
		
		colegaDao.baja(loguin);
		
		
	}
}
