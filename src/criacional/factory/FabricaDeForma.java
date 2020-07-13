package criacional.factory;

public class FabricaDeForma {
	
	IForma getForma(String tipoForma) {	
		
		if (tipoForma.equalsIgnoreCase("Triangulo")) 
			return new Triangulo();
		
		if (tipoForma.equalsIgnoreCase("Circulo")) 
			return new Circulo();
		
		
		if (tipoForma.equalsIgnoreCase("Retangulo")) 
			return new Retangulo();
		
		
		return null;
		
	}
}
