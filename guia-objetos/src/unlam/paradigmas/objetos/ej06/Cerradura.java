package unlam.paradigmas.objetos.ej06;

public class Cerradura {
	
	int clave;
	int cantFallos;
	int aperturasExitosas;
	int aperturasFallidas;
	boolean abierta;
	boolean bloqueada;

	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.clave = claveDeApertura;
		this.cantFallos = cantidadDeFallosConsecutivosQueLaBloquean;
		this.abierta = false;
		this.bloqueada = false;
		this.aperturasExitosas = 0;
		this.aperturasFallidas = 0;
	}

	/**
	 * pre : la caja está cerrada
	 * pos : devuelve el estado de la caja
	 */
	public boolean abrir(int clave) {
		if(this.clave == clave)
			this.abierta = true;
		
		return this.abierta;
	}
	/**
	 * pre : la caja está abierta
	 * pos : la caja cambia su estado a cerrada
	 */
	public void cerrar() {
		this.abierta = false;
	}
	
	/**
	 * pos : devuelve el estado de la caja
	 */
	public boolean estaAbierta() {
		return this.abierta;
	}
	
	/**
	 * pre : la caja está cerrada
	 * pos : devuelve el estado de la caja
	 */
	public boolean estaCerrada() {
		return !this.abierta;
	}
	
	/**
	 * pos : devuelve si la caja fue bloqueada
	 */
	public boolean fueBloqueada() {
		return this.bloqueada;
	}
	
	/**
	 * pos : devuelve la cantidad de aperturas exitosas
	 */
	public int contarAperturasExitosas() {
		return this.aperturasExitosas;
	}
	
	/**
	 * pos : devuelve la cantidad de aperturas fallidas
	 */
	public int contarAperturasFallidas() {
		return this.aperturasFallidas;
	}

}
