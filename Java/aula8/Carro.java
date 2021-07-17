package aula03;

public class Carro {
	
	String modelo;
	String cor;
	boolean ligado;
	int velocidadeAtual;
	int velocidadeMaxima = 100;
	
	public void ligar() {
		if(ligado) {
			System.out.println("Carro: " + modelo + " já foi ligado!!!");			
		}else {
			ligado = true;
			System.out.println("Carro: " + modelo + " ligado corretamente!!!");
		}
	}
	
	public void desligar() {
		if(ligado) {
			ligado = false;
			velocidadeAtual = 0;
			System.out.println("Carro: " + modelo + " desligado corretamente!!!");
		}else {
			System.out.println("Carro: " + modelo + " já está desligado!");
		}
	}
	
	public void acelerar() {
		if(ligado) {
			velocidadeAtual = velocidadeAtual + 60;
			if (velocidadeAtual > velocidadeMaxima) {
				desligar();
			}else {
				System.out.println("Carro: " + modelo + " acelerado! Velocidade Atual: " + velocidadeAtual);				
			}
		}else {
			System.out.println("Carro: " + modelo + " está desligado e não pode ser acelerado!!");
		}
	}
}
