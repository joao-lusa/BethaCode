package aula09;

public class Carro {
	String modelo;
	int ano;
	String cor;
	boolean ligado;
	int velocidade_maxima;
	int velocidade_atual;
	
	public boolean ligar() {
		if(ligado) {
			return false;
		}
		ligado = true;
		return true;
	}
	
	public boolean desligar() {
		if(ligado == false) {
			return false;
		}
		ligado = false;
		return true;		
	}
	
	public void acelerar(int velocidadeDesejada) {
		if(ligado == false) {
			System.out.println("Carro: " + modelo + " est� desligado!!!");
			return;
		}
		
		int novaVelocidade = velocidade_atual + velocidadeDesejada;
		if (novaVelocidade > velocidade_maxima) {
			System.out.println("O carro suporta no maximo: " + velocidade_maxima);
			System.out.println("Com esta acelera��o teremos: " + novaVelocidade);
			System.out.println("Acelera��o n�o realizada!!!");
			return;
		}
		
		velocidade_atual = velocidade_atual + velocidadeDesejada;
	}
	
	public void desacelerar(int velocidadeDesejada) {
		if(ligado == false) {
			System.out.println("Carro: " + modelo + " est� desligado!!!");
			return;
		}
		
		int novaVelocidade = velocidade_atual - velocidadeDesejada;
		if (novaVelocidade < 0) {
			System.out.println("O carro vai ficar com velocidade negativa!");
			System.out.println("Com esta desacelera��o teremos: " + novaVelocidade);
			System.out.println("Desacelera��o n�o realizada!!!");
			return;			
		}
		
		velocidade_atual = velocidade_atual - velocidadeDesejada;
	}	
	
	public void desacelerar() {
		if(ligado == false) {
			System.out.println("Carro: " + modelo + " est� desligado!!!");
			return;
		}
		velocidade_atual = 0;
	}	

    @Override
    public String toString() {
    	return "Carro: " + modelo + " da Cor: " + cor + " fabricado em: " + ano +
    			"Ligado: " + (ligado ? "Sim" : "N�o") + " Velocidade: " + velocidade_atual;
    }	
}
