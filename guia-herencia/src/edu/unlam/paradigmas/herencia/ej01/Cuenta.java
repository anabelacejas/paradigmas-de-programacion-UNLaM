package edu.unlam.paradigmas.herencia.ej01;

public class Cuenta {
	private int saldo;

	public Cuenta() {
		this.saldo = 0;
	}

	public int extraer(int cantidad) {
		int cantExtraida = 0;
		try {
			if (cantidad > 0 && this.saldo > cantidad) {
				this.saldo -= cantidad;
				cantExtraida = cantidad;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("no hay saldo suficiente");
		}
		
		return cantExtraida;
	}

	public boolean depositar(int cantidad) {
		boolean operacion;

		if (operacion = (cantidad > 0)) {
			this.saldo += cantidad;
		}

		return operacion;
	}

	public int consultarSaldo() {
		return this.saldo;
	}
	
	public void transferir(int cantidad, Cuenta destino) {
		if(this.extraer(cantidad) != 0) {
			destino.depositar(cantidad);
		}
	}

	

}
