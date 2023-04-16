package unlam.paradigmas.objetos.ej02;

public class Punto {
	private double x;
	private double y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double obtenerX() {
		return this.x;
	}
	
	public double obtenerY() {
		return this.y;
	}
	
	public void cambiarX(double nuevoX) {
		this.x = nuevoX;
	}
	
	public void cambiarY(double nuevoY) {
		this.y = nuevoY;
	}
	
	public boolean estaSobreEjeX() {
		return this.y == 0;
	}
	
	public boolean estaSobreEjeY() {
		return this.x == 0;
	}
	
	public boolean esElOrigen(){ 
		return this.x == 0 && this.y == 0;
	}
	
	public double distanciaAlOrigen(){
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	public double distanciaAotroPunto(Punto otro){
		double distX = this.x - otro.x;
		double distY = this.y - otro.y;
		
		return Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
	}
	
	
}
