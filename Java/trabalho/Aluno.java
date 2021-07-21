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
			System.out.println(professor + " você ja passou a prova!!");
		}else {
			prova = true;
			System.out.println(professor + " enviou a prova com sussesso.");
		}
	}
	
	public void passarNota(){
		if(prova = false) {
			System.out.println("o aluno " + nome + " ainda não fez a prova");
		}else {
			System.out.println("a nota do aluno é: ");
			enviarNota = sc.nextDouble();
		}
	}
	public void FazerProva() {
		if(nota) {
			System.out.println(nome + " você ja fez essa prova");
		}else {
			nota = true;
			System.out.println(nome + " parabêns você concluiu a prova com sucesso.");
		}
	}
	public void VerificarNota() {
		if(prova) {
			System.out.println("você ainda não fez a prova!!!");
		}else if(enviarNota >=7) {
			System.out.println("parabêns você passou xD ...");
		}else{
			System.out.println("infelizmente você não passou :( ...");
		}
	}
}