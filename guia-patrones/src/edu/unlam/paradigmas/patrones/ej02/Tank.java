package edu.unlam.paradigmas.patrones.ej02;

public class Tank {
	private TankState estado;
	
	public Tank() {
		this.estado = new TankModeTankState(this);
	}
	
	public void modoTanque() {
		estado = new TankModeTankState(this);
	}
	
	public void modoAsedio() {
		estado = new TankModeSiegeState(this);
	}
	
	public void moverse() {
		this.estado.moverse();
	}
	
	public void atacar()
	{
		this.estado.atacar();
	}
	
	
	
}
