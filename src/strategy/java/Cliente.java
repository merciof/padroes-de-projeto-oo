package strategy.java;

public class Cliente {
	
	Calculadora algoritmo;
	

	public void setAlgoritmo(Calculadora algoritmo) {
		this.algoritmo = algoritmo;
	}


	public String calcular() {
		return	this.algoritmo.calcular();
		
	}
	
}
