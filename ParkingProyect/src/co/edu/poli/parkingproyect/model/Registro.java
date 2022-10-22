package co.edu.poli.parkingproyect.model;

import java.util.*;

/**
 * 
 */

//CLASE ABSTRACTA, CLASE PRINCIPAL DEL PATRON FACHADA (es necesario implementarse en un pakage diferente)
public abstract class Registro {

    /**
     * Default constructor
     */
    public Registro() {
    }

    /**
     * 
     */
    private String Nombre;

    /**
     * 
     */
    private String Apellido;

    /**
     * 
     */
    private String Placa;

    /**
     * 
     */
    private int Hora;

    /**
     * @param Nombre 
     * @param Apellido 
     * @param Placa 
     * @param Hora
     * @throws ClassNotFoundException 
     */
    
    // FIRMA ENCARGADA DE GENERAR DIFERENTES REGISTROS (IMPLEMENTACION EN LAS CLASES HIJAS)
    public abstract void Registrar(String Nombre, String Apellido, String Placa, String Hora) throws ClassNotFoundException;

}