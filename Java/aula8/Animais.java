package aula8;

public class Animais {
	String tipo;
	String nome; 
	boolean alimentado;
	boolean dormindo;
	
	public void alimentar(){
		if(alimentado) {
			System.out.println("animal: " + nome + " do tipo " + tipo +  " ja foi alimentado");
		}else {
			alimentado = true;
			System.out.println("animal: " + nome + " do tipo " + tipo + " alimentado");
		}
	}
	
	public void dormir() {
		if(alimentado) {
			dormindo = true;
			System.out.println("animal: " + nome +  " está dormindo");
		}else {
			System.out.println("animal: " + nome + " tem que ser alimentado");
		}
	}
	
	public void mostrar() {
		System.out.println("O " + tipo + nome + " foi alimentado " + alimentado + " e ja foi dormir " + dormindo);
	}
}
