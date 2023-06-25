package edu.unlam.paradigmas.patrones.ej02;

public class TankModeTankState implements TankState {

	private Tank tanque;

	public TankModeTankState(Tank tanque) {
		this.tanque = tanque;
	}

	@Override
	public void moverse() {
		System.out.println("Movimiento de modo tanque");
	}

	@Override
	public void atacar() {
		System.out.println("Ataque de modo tanque");
	}
}
