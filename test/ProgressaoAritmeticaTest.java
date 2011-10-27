import static org.junit.Assert.*;

import org.junit.Test;


public class ProgressaoAritmeticaTest {

	@Test
	public void deveCalcularTermoNDeUmaProgressaoAritmeticaCrescente() {
		int[] numerosInteiros = {1,3,5,7,9};
		int n = 50;
		int progressaoAritmetica = EncontraPa.calcula(numerosInteiros, n);
		assertEquals(99, progressaoAritmetica);
	}
	
	@Test
	public void deveCalcularTermoNDeUmaProgressaoAritmeticaCrescente2() {
		int[] numerosInteiros = {2,6,10,14,18};
		int n = 142;
		int progressaoAritmetica = EncontraPa.calcula(numerosInteiros, n);
		assertEquals(566, progressaoAritmetica);
	}
	
	@Test
	public void deveCalcularTermoNDeUmaProgressaoAritmeticaEstacionaria() {
		int[] numerosInteiros = {3,3,3,3,3};
		int n = 142;
		int progressaoAritmetica = EncontraPa.calcula(numerosInteiros, n);
		assertEquals(3, progressaoAritmetica);
	}
	
	@Test
	public void deveCalcularTermoNDeUmaProgressaoAritmeticaDecrescente() {
		int[] numerosInteiros = {5,4,3,2,1};
		int n = 10;
		int progressaoAritmetica = EncontraPa.calcula(numerosInteiros, n);
		assertEquals(-4, progressaoAritmetica);
	}
	
}
