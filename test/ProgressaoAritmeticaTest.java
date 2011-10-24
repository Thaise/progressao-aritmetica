import static org.junit.Assert.*;

import org.junit.Test;


public class ProgressaoAritmeticaTest {

	@Test
	public void deveCalcularTermoNDeUmaProgressaoAritmeticaCrescente() {
		String[] numerosSeparados = {"1","3","5","7","9"};
		int n = 50;
		String progressaoAritmetica = EncontraPa.calcula(numerosSeparados, n);
		assertEquals("O 50 termo da P.A. é 99 -> 1,3,5,7,9...99", progressaoAritmetica);
	}
	
	@Test
	public void deveCalcularTermoNDeUmaProgressaoAritmeticaCrescente2() {
		String[] numerosSeparados = {"2","6","10","14","18"};
		int n = 142;
		String progressaoAritmetica = EncontraPa.calcula(numerosSeparados, n);
		assertEquals("O 142 termo da P.A. é 566 -> 2,6,10,14,18...566", progressaoAritmetica);
	}
	
	@Test
	public void deveCalcularTermoNDeUmaProgressaoAritmeticaEstacionaria() {
		String[] numerosSeparados = {"3","3","3","3"};
		int n = 142;
		String progressaoAritmetica = EncontraPa.calcula(numerosSeparados, n);
		assertEquals("O 142 termo da P.A. é 3 -> 3,3,3,3...3", progressaoAritmetica);
	}
	
	@Test
	public void deveCalcularTermoNDeUmaProgressaoAritmeticaDecrescente() {
		String[] numerosSeparados = {"5","4","3","2","1"};
		int n = 10;
		String progressaoAritmetica = EncontraPa.calcula(numerosSeparados, n);
		assertEquals("O 10 termo da P.A. é -4 -> 5,4,3,2,1...-4", progressaoAritmetica);
	}
	
	@Test
	public void deveRetornarQueEsteConjuntoNaoEUmaPA() {
		String[] numerosSeparados = {"2","3","4","8","19"};
		int n = 142;
		String progressaoAritmetica = EncontraPa.calcula(numerosSeparados, n);
		assertEquals("Não é uma P.A.!", progressaoAritmetica);
	}
	
}
