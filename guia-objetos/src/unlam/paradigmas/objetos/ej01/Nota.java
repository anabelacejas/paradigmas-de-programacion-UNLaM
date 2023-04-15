package unlam.paradigmas.objetos.ej01;

public class Nota {
	
	int valor;
	
    /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */
    public Nota(int valorInicial) {
    	this.valor = valorInicial;
    }
    
    /**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */
    public int obtenerValor() {
    	return this.valor;
    }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
    	return this.valor >= 7;
    }
    
    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
    	return this.valor < 7;
    }
}
