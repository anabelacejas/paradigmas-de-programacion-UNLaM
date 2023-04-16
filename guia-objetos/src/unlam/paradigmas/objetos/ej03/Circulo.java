package unlam.paradigmas.objetos.ej03;

public class Circulo {
	double radio;
	
	public Circulo(double radio) {
		setRadio(radio);
	}

	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		if (radio >= 0)
			this.radio = radio;
	}

	public double getDiametro() {
		return this.radio * 2;
	}

	public void setDiametro(double diametro) {
		this.radio = diametro / 2;
	}

	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}

	public void setPerimetro(double perimetro) {
		this.radio = (perimetro / Math.PI) / 2;
	}

	public double getArea() {
		return Math.PI * radio * radio;
	}

	public void setArea(double area) {
		this.radio = Math.sqrt(area / Math.PI);
	}

}
