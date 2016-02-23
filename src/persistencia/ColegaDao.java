package persistencia;

import java.sql.SQLException;
import java.util.Collection;

import modelo.Colega;

public interface ColegaDao {

	void alta(Colega colega) throws SQLException;
	
	void baja(int id) throws SQLException;
	
	void modifica(Colega colega) throws SQLException;
	
	Colega consulta(int id) throws SQLException;
	
	Collection<Colega>consulta() throws SQLException; 
}
