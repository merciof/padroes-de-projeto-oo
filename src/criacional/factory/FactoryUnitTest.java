package criacional.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactoryUnitTest {

	FabricaDeForma _fabricaDeForma;
	
	@Before
	public void criacaoObjetos() {
		_fabricaDeForma = new FabricaDeForma();
	}
	
	@Test
	public void testRetangulo() {
		IForma forma = _fabricaDeForma.getForma("retangulo");
		assertEquals("Executando desenho de Retangulo", forma.draw());
	}
	
	@Test
	public void testTriangulo() {
		IForma forma = _fabricaDeForma.getForma("Triangulo");
		assertEquals("Executando desenho de Triangulo", forma.draw());
	}
	
	@Test
	public void testCirculo() {
		IForma forma = _fabricaDeForma.getForma("circulo");
		assertEquals("Executando desenho de Circulo", forma.draw());
	}

}
