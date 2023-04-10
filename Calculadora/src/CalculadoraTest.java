import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma(){
		Calculadora calcu = new Calculadora(20,2);
		double resultado = calcu.suma();
		assertEquals(22,resultado);
		fail("Not yet implemented");
	}

	@Test
	void testResta(){
		Calculadora calcu = new Calculadora(20,2);
		double resultado = calcu.resta();
		assertEquals(18,resultado);
		fail("Not yet implemented");
	}

	@Test
	void testMultiplica(){
		Calculadora calcu = new Calculadora(20,2);
		double resultado = calcu.multiplica();
		assertEquals(40,resultado);
		fail("Not yet implemented");
	}

	@Test
	void testDivide(){
		Calculadora calcu = new Calculadora(20,2);
		double resultado = calcu.divide();
		assertEquals(10,resultado);
		fail("Not yet implemented");
	}

}
