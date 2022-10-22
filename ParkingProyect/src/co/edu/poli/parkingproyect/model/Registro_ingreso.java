package co.edu.poli.parkingproyect.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * 
 */

// CLASE ENCARGADA DE CREAR UN OBJETO REGISTRO QUE AGREGA UN REGISTRO A LA DB
public class Registro_ingreso extends Registro {
	

	/**
     * @param Nombre 
     * @param Apellido 
     * @param Placa 
     * @param Hora
     * @throws ClassNotFoundException 
     */
	
	// IMPLMENTACION DEL METODO REGISTRAR PARA INSERTAR DATOS EN LA TABLA DB
    public void Registrar(String Nombre, String Apellido, String Placa, String Hora) throws ClassNotFoundException {
    	
    	//QUERY
    	String consulta = "insert into registros (nombre, apellido, placa, hora_ingreso, hora_salida) values ('"+ Nombre +"','"+ Apellido +"','" + Placa +"'," + Hora + ", 0);";                  
    	try {
    		//INICIAMOS LA CONEXION
			Statement sentencia = Conexion.obtener().createStatement();
			
			//EJECUTAMOS LA QUERY
			int resultado = sentencia.executeUpdate(consulta);

		} catch (SQLException e) {

			e.printStackTrace();
		}
    	
    }

}