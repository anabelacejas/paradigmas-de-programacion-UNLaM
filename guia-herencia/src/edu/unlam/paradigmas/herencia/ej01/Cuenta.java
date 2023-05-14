package edu.unlam.paradigmas.herencia.ej01;

public class Cuenta {
	public int saldo;
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		System.out.println(miCuenta.saldo); // 0
		miCuenta.saldo += 1000;
		System.out.println(miCuenta.saldo); // 1000
		miCuenta.saldo -= 550;
		System.out.println(miCuenta.saldo); // 450
	}
	
	public Cuenta() {
		this.saldo = 0;
	}
	
}
