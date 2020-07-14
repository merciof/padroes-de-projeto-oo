package comportamental.TemplateMethod;

public abstract class Jogo {
	
	abstract void iniciar();
	
	abstract void jogar();
	
	abstract void finalizar();
	
	public void templateMethod() {
		
		ligar();
		
		iniciar();
		
		jogar();
		
		finalizar();
		
		desligar();
	}
	
	 void ligar() {
		System.out.println("Executando o metodo ligar!");
	}
	 
	 void desligar() {
		 System.out.println("Executando o metodo desligar");
	 }

}
