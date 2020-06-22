package composicao.observador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesterObservador {

	Assunto assunto;
	
	@Before	
	public void criarAssunto() {
		assunto = new Assunto();
	}
	
	@Test
	public void alteracaoEstado() {
		
		//assunto.setEstado(0);
		assertEquals(0, assunto.getEstado());
	}
	
	@Test
	public void adicionarUmObservador() {
		Observador observador = new Binario();
		assunto.adicionarObservador(observador);
		assertEquals(1, assunto.observadores.size());
	}
	
	@Test
	public void adicionarTresObservadores() {
		Observador observador_1 = new Binario();
		Observador observador_2 = new Octal();
		Observador observador_3 = new Hexa();
		assunto.adicionarObservador(observador_1);
		assunto.adicionarObservador(observador_2);
		assunto.adicionarObservador(observador_3);
		assertEquals(3, assunto.observadores.size());
	}
	
	@Test
	public void removerUmObservador() {
		Observador observador = new Binario();
		assunto.adicionarObservador(observador);
		assertEquals(1, assunto.observadores.size());
		assunto.removerObservador(observador);
		assertEquals(0, assunto.observadores.size());
		
	}
	
	@Test
	public void removerTresObservadores() {
		Observador observador_1 = new Binario();
		Observador observador_2 = new Octal();
		Observador observador_3 = new Hexa();
		assunto.adicionarObservador(observador_1);
		assunto.adicionarObservador(observador_2);
		assunto.adicionarObservador(observador_3);
		assunto.removerObservador(observador_1);
		assunto.removerObservador(observador_2);
		assunto.removerObservador(observador_3);
		assertEquals(0, assunto.observadores.size());
		
	}
	
	
	
	
	
	

}
