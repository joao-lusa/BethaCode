 package aula9;

public class Jogador {
	String nome;
	int forca = 0;
	
	public void chute(int chute) {
		this.forca += chute;
	}
	
	public void soco(int soco) {
		this.forca += soco;
	}
	
	public void beberAgua(int beberAgua) {
		this.forca += beberAgua;
	}
	
	public void comerPao(int comerPao) {
		this.forca += comerPao;
	}
	
	public int gas() {
		return this.forca;
	}
}
