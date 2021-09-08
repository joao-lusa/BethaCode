package aula15;

public class UtilitarioDeAnimal {
	
	public static void animalFalando(Animal objetoAnimal) {
		objetoAnimal.falar();
		objetoAnimal.andar();
	}
	
	public static void falaPorInterface(Fala objetoInterface) {
		objetoInterface.formaDeFalar();
	}

}
