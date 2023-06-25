package edu.unlam.paradigmas.patrones.ej02;

public class TankModeSiegeState implements TankState{
	
	private Tank tanque;
	
	public TankModeSiegeState(Tank tanque) {
		this.tanque = tanque;
	}
	
	@Override
	public void moverse() {
		System.out.println("Movimiento de modo asedio");
	}
	
	@Override
	public void atacar()
	{
		System.out.println("Ataque de modo asedio");
	}
	

}
