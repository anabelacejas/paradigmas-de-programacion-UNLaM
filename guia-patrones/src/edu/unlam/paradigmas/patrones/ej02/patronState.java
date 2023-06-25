package edu.unlam.paradigmas.patrones.ej02;

public class patronState {

	
	public static void main(String[] args) {
	
		Tank tanque = new Tank();
		
		tanque.moverse();
		tanque.atacar();
		
		tanque.modoAsedio();
		
		tanque.moverse();
		tanque.atacar();
		
		tanque.modoTanque();
		
		tanque.moverse();
		tanque.atacar();
	}

}
