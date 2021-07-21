package trabalho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//instância a classe Alunos().
		Aluno alunos = new Aluno();

		//variavel que vai ser utilizada para guardar a infomração do usuario para saber se ele é professor ou aluno.
		int professorAluno;
		//variavel que vai guardar qual operacao do professor ou do aluno.
		int operacao;
		
		
		System.out.println("Informe a tuma:");
		String turma = sc.next();
		alunos.turma = turma;
		System.out.print("Infome o nome do professor: ");
		String professor = sc.next();
		alunos.professor = professor;
		System.out.print("Infome agora o nome do aluno: ");
		String aluno = sc.next();
		alunos.nome = aluno;
		
		double enviarNota;
		
		do {
			System.out.println("-------------------------------------------------");
			System.out.println("Escolha a operação a ser realiada caso deseja parar digite 0 !!");
			System.out.println("Você é professor ou é aluno ?");
			System.out.print("Digite 1 para aluno e 2 para professor: ");
			professorAluno = sc.nextInt();
			System.out.println("-------------------------------------------------");
			
			switch(professorAluno) {
				case 1:
					System.out.println("Bem vindo aluno: " + aluno + "da turma:" + turma);
					System.out.println("Escolha agora o que deseja realizar");
					System.out.println("1 - fazer a prova");
					System.out.println("2 - verificar a nota");
					System.out.print("Operação: ");
					operacao = sc.nextInt();
					switch(operacao) {
					case 1:
						alunos.FazerProva();
					break;
					case 2: 
						alunos.VerificarNota();
					break;
				}
					
				break;
				
				case 2:
					System.out.println("Bem vindo professor: " + professor + "para a turma: " + turma + ("."));
					System.out.println("Escolha agora o que deseja realizar");
					System.out.println("1 - passar prova");
					System.out.println("2 - Enviar a nota da prova");
					System.out.print("Operação: ");
					operacao = sc.nextInt();
					switch(operacao) {
						case 1:
							alunos.PassarProva();
						break;
						case 2: 
							alunos.passarNota();
						break;
					}
					
				break;
			}	
			
		}while(professorAluno != 0);
	}
}