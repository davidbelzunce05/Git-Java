package org.cuatrovientos.dam.ed.ejemplos2ev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * Hello world!
 *
 */
public class Calculadora 
{
	private static Logger logger = LogManager.getLogger();
	private String operacionEnCurso;
	/**
	 * @return the operacionEnCurso
	 */
	public String getOperacionEnCurso() {
		return operacionEnCurso;
	}
	/**
	 * @param operacionEnCurso the operacionEnCurso to set
	 */
	public void setOperacionEnCurso(String operacionEnCurso) {
		this.operacionEnCurso = operacionEnCurso;
	}
	/**
	 * Metodo main de ejecución, escribe un log y hace una suma
	 * @param args el nombre a pintar en el log, ojo que tiene que tener un solo valor el array
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.error("Otro hellow World 1DAM: "+args[0]);
        // Todo Crear una función que haga sumas
        int a = 1 + 1;
        switch (args[0]) {
        case "suma1":
        	int resultado = miCalculadora
        }
    }
    {
    	
    }
}
