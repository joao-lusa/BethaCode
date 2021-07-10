package aula7;

public class TestaArray {
	public static void main(String[] args) {
		
		double[] precos = new double[3];
		
		precos[0] = 1.99;
		precos[1] = 2.99;
		precos[2] = 3.99;
		
		for (double cadaPreco : precos) {
			System.out.println(cadaPreco);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(precos[i]);
		}
	}

}