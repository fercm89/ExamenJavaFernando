package negocio;

import java.sql.SQLException;

import modelo.Colega;

public interface NegocioColegasInterfaz {

	void registroDeColegaEnLaAplicacion(Colega colega) throws SQLException;
	
	void bajaDeColegaEnLaAplicacion(int loguin) throws SQLException;
	
}
