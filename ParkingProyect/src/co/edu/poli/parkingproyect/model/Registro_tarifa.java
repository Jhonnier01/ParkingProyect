package co.edu.poli.parkingproyect.model;

import co.edu.poli.parkingproyect.controller.MainSceneController;
import co.edu.poli.parkingproyect.dao.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * 
 */

//CLASE ENCARGADA DE CREAR UN OBJETO REGISTRO QUE CALCULA UNA TARIFA USANDO VALORES DE LA DB
public class Registro_tarifa extends Registro {

    /**
     * Default constructor
     */
    public Registro_tarifa() {
    }

    /**
     * @param Nombre 
     * @param Apellido 
     * @param Placa 
     * @param Hora
     * @throws ClassNotFoundException 
     */
    
    //METODO PARA CLACULAR LA TARIFA, CADA UNO DE LOS QUERY REALIZA UNA ACCION DIFERENTE
    public void Registrar(String Nombre, String Apellido, String Placa, String Hora) throws ClassNotFoundException {
    	
    	// QUERY PARA MODIFICAR/AGREGAR LA HORA DE SALIDA DEL VEHICULO
    	String consulta = "UPDATE registros set hora_salida = " + Hora + " where placa = '" + Placa +"';";
    	
    	//QUERY PARA OBTENER EL DATIO DE LA HORA DE INGRESO DEL VEHICULO
    	String consulta2 = "Select hora_ingreso from registros where placa ='" + Placa + "' ; ";
    	
    	try {
    		
    		//INICIAMOS LA CONEXION
			Statement sentencia = Conexion.obtener().createStatement();
			
			//EJECUTAMOS LA QUERY
			int resultado = sentencia.executeUpdate(consulta);
			
			//OBTENEMOS EL RESULTADO
			ResultSet hora_ingreso = sentencia.executeQuery(consulta2);
			String ingreso = "";
			while (hora_ingreso.next()) {
				  ingreso = hora_ingreso.getString(1);
			}
			int ingresoint = Integer.parseInt(ingreso);
			int salidaint = Integer.parseInt(Hora);
			double total = (salidaint-ingresoint);
			total = (total/100)*6100;
			System.out.println(total);

		} catch (SQLException e) {

			e.printStackTrace();
		}
    	
    }

}