package trabalho;

import java.util.Scanner;

public class Aluno {
	Scanner sc = new Scanner(System.in);

	String nome;
	String turma;
	String professor;
	boolean nota;
	boolean prova;
	double enviarNota;
	
	public void PassarProva(){
		if(prova) {
			System.out.println(professor + " voc� ja passou a prova!!");
		}else {
			prova = true;
			System.out.println(professor + " enviou a prova com sussesso.");
		}
	}
	
	public void passarNota(){
		if(prova = false) {
			System.out.println("o aluno " + nome + " ainda n�o fez a prova");
		}else {
			System.out.println("a nota do aluno �: ");
			enviarNota = sc.nextDouble();
		}
	}
	public void FazerProva() {
		if(nota) {
			System.out.println(nome + " voc� ja fez essa prova");
		}else {
			nota = true;
			System.out.println(nome + " parab�ns voc� concluiu a prova com sucesso.");
		}
	}
	public void VerificarNota() {
		if(prova) {
			System.out.println("voc� ainda n�o fez a prova!!!");
		}else if(enviarNota >=7) {
			System.out.println("parab�ns voc� passou xD ...");
		}else{
			System.out.println("infelizmente voc� n�o passou :( ...");
		}
	}
}