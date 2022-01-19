package POO;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class junit3Test {

	@ParameterizedTest
	@ValueSource(ints = {1, 5, 3})
	void testMostrarMultiplos(int prueba) {
		
		junit3 j = new junit3(3,60);

		int [] a= new int[1];
		
		a=j.mostrarMultiplos(3, 100);
		
		
		
	}

}
