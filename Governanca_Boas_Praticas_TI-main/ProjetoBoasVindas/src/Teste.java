import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class Teste {

	@Test
	public void exibirMensagem() {
		Boasvindas boasvindas = new Boasvindas(null);
		String msg;
		boasvindas.exibirMenssagem();
		msg = null;
		assertEquals(msg, boasvindas);

	}

	@Test
	public void completarMensagem() {
		Boasvindas boasvindas = new Boasvindas(null);
		String msg;
		boasvindas.completarMenssagem();
		msg = "Ola! Seja bem vindo a sua calculadora pessoal";
		assertEquals(msg, boasvindas);
	}
//	@Test
//	public void testeCriaMesnsagemPadrao() {
//	String mensx;
//	mensx = "Pedro Bo";
//	Boasvindas mensagemUsuario = new Boasvindas(mensx);
//	String mensretorno = mensagemUsuario.completarMenssagem();
//	assertEquals("Ola! Seja bem vindo a sua calculadora pessoal", mensretorno);
//	}
//	@Test
//	public void testeExibeMesnsagem() {
//	String mensx;
//	mensx = "Pedro Bo";
//	Boasvindas mensagemUsuario = new Boasvindas(mensx);
//	String mensRetorno;
//	mensRetorno = mensagemUsuario.exibirMenssagem();
//	assertEquals(mensx, mensRetorno);
//	}

}
