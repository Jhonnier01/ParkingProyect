package co.edu.poli.parkingproyect.model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import co.edu.poli.parkingproyect.dao.Conexion;

/**
 * 
 */
//CLASE ENCARGADA DE CREAR UN OBJETO REGISTRO QUE ELIMINA UN REGISTRO A LA DB
public class Registro_salida extends Registro {

    /**
     * Default constructor
     */
    public Registro_salida() {
    }

    /**
     * @param Nombre 
     * @param Apellido 
     * @param Placa 
     * @param Hora
     * @throws ClassNotFoundException 
     */
    
	// IMPLMENTACION DEL METODO REGISTRAR PARA ELIMINAR DATOS EN LA TABLA DB
    public void Registrar(String Nombre, String Apellido, String Placa, String Hora) throws ClassNotFoundException {
    	
    	//QUERY
    	String consulta = "delete from registros where placa ='" + Placa + "'";                  
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