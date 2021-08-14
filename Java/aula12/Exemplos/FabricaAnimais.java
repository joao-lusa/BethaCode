package aula12;

public class FabricaAnimais {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Dumbo", "elefante");
		Cachorro cachorro = new Cachorro("Totó", "Vira-lata", false);
		Gato gato = new Gato("Mingau", "Vira-lata", 7);
		
		System.out.println(animal.caminha()); 
		System.out.println(cachorro.caminha());
		System.out.println(cachorro.latir());
		System.out.println(gato.caminha());
		System.out.println(gato.miar());
		gato.setQuantidadeDeVidas(1);
		System.out.println(gato.caminha());
		
	}

}
