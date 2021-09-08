package aula15;

public class AnimaisFactory {
	public static void main(String[] args) {
		Cachorro rex = new Cachorro("Pastor alemão", "rex");
		System.out.println(rex);
		UtilitarioDeAnimal.animalFalando(rex);
		
		System.out.println("");
		
		Gato mingau = new Gato("Siames", "Mingau");
		System.out.println(mingau);
		UtilitarioDeAnimal.animalFalando(mingau);
		
		System.out.println("");
		
		Galinha Jertrudes = new Galinha();
		UtilitarioDeAnimal.falaPorInterface(Jertrudes);
		
		System.out.println("");

		UtilitarioDeAnimal.falaPorInterface(rex);
		
	}
}
