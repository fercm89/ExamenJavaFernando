package persistencia;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Date;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

import modelo.Colega;

public class TestMySqlColegaDao {

	@Test
		public void test()  throws SQLException {
		//Datos de Entrada 
			Colega colega = new Colega (4356,"Fernando", "Madrid", new Date());
			new java.sql.Date(0);
			
		
			//Datos Esperados de Salida
			
			BasicDataSource ds = new BasicDataSource();
			ds.setUrl("jdbc:mysql://localhost:3306/colegajdbc");//cadena de conexion
			ds.setUsername("root");
			ds.setPassword("rootroot");
			ds.setDriverClassName("com.mysql.jdbc.Driver");
			//sut
			MySqlColegaDao sut =  new MySqlColegaDao (ds);
			
			//Ejecucion
			try {
				sut.alta(colega);
				
				Colega colegaObtenido = sut.consulta(colega.getId());
				
				//Assertos
				assertEquals(colega, colegaObtenido);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("Se produce un sqlException, y no deberia: " + e.getMessage());
			}
		
	}
}
