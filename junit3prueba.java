package POO;

import java.util.Iterator;

public class junit3prueba {

	public static void main(String[] args) {
		
		junit3 j = new junit3(3,60);

		int [] a= new int[1];
		
		a=j.mostrarMultiplos(3, 100);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
