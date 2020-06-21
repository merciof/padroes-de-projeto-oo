package composicao.observador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesterObservador {

	@Test
	public void alteracaoEstado() {
		Assunto assunto = new Assunto();
		assunto.setEstado(0);
		assertEquals(0, assunto.getEstado());
	}

}
