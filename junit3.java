package POO;

public class junit3 {

	private static int n;
	private static int m;
	
	public junit3(int a1, int a2) {
		
		n=a1;
		m=a2;
		
	}
	
	public int[] mostrarMultiplos(int n,int m) {
		
		int []a=new int[m/n];
		
		int z = 0;		
		for (int i = 1; i <= m; i++) {
			
			if(i%n==0) {
				a[z]=i;
				z++;
			}
		}
		
		return a;
	}
	
}
