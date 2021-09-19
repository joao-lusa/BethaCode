package aplicacao;

import DAO.AlunoDAO;
import conexao.ConexaoJDBC;
import model.Aluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BethaCodeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idDoAluno;
        int opcao = 0;
        AlunoDAO alunoDAO = new AlunoDAO();
        //adicionar aluno novo
//        Aluno aluno01 = new Aluno("Joao Lucas Pereira Rafael", 19, "Sombrio", "SC");
//        alunoDAO.criarAluno(aluno01);
//        Aluno aluno02 = new Aluno("Otavio", 20, "TC", "RS");
//        alunoDAO.criarAluno(aluno02);

        //buscar todos os alunos cadastrados
//       List<Aluno> alunosCadastrados = alunoDAO.buscarAlunos();
//       alunosCadastrados.forEach(aluno -> System.out.println(aluno));

        //buscar por id
//        Aluno alunoCadastrado = alunoDAO.buscarPorId(2);
//        System.out.println(alunoCadastrado);

        //Busca aluno por id, altera a cidade
//        Aluno alunoCadastrado = alunoDAO.buscarPorId(4);
//        alunoCadastrado.setCidade("Criciúma");
//        alunoDAO.atualizarAlunos(alunoCadastrado);

        //Buca aluno por id, e exclui no banco
//        Aluno alunoCadastrado = alunoDAO.buscarPorId(2);
//        alunoDAO.excluirAlunos(alunoCadastrado);

        do {
            System.out.println("------------------------------------------------");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - buscar todos os alunos cadastrados");
            System.out.println("3 - buscar por numero de aluno (id) ");
            System.out.println("4 - alterar nome de um aluno(pelo id) ");
            System.out.println("5 - alterar Idade de um aluno(pelo id)");
            System.out.println("6 - alterar Cidade de um aluno(pelo id)");
            System.out.println("7 - excluir aluno do banco de dados !! ");
            System.out.println("0 - sair do programa");
            System.out.print("escolha o que você quer fazer: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("informe o nome: ");
                    sc.nextLine();
                    String nomeDoAluno = sc.nextLine();
                    System.out.print("Informem a idade: ");
                    Integer idadeDoAluno = sc.nextInt();
                    System.out.print("Infome a cidade");
                    sc.nextLine();
                    String cidadeDoAluno = sc.nextLine();
                    System.out.print("Informe o estado: ");
                    String estadoDoAluno = sc.next();
                    Aluno aluno01 = new Aluno(nomeDoAluno, idadeDoAluno, cidadeDoAluno, estadoDoAluno);
                    alunoDAO.criarAluno(aluno01);
                    break;
                case 2:
                    List<Aluno> alunosCadastrados = alunoDAO.buscarAlunos();
                    alunosCadastrados.forEach(aluno -> System.out.println(aluno));
                    break;
                case 3:
                    System.out.print("Numero(ID): ");
                    idDoAluno = sc.nextInt();
                    Aluno idAlunoCadastrado = alunoDAO.buscarPorId(idDoAluno);
                    System.out.println(idAlunoCadastrado);
                    break;
                case 4:
                    System.out.print("Numero do aluno(ID): ");
                    idDoAluno = sc.nextInt();
                    System.out.print("Nome novo: ");
                    sc.nextLine();
                    String nomeNovoDoAluno = sc.nextLine();
                    Aluno alunoCadastrado = alunoDAO.buscarPorId(idDoAluno);
                    alunoCadastrado.setNome(nomeNovoDoAluno);
                    alunoDAO.atualizarAlunos(alunoCadastrado);
                    break;
                case 5:
                    System.out.print("Numero do aluno(ID): ");
                    idDoAluno = sc.nextInt();
                    System.out.print("nova idade: ");
                    Integer idadeNovoDoAluno = sc.nextInt();
                    Aluno idadeAlunoCadastrado = alunoDAO.buscarPorId(idDoAluno);
                    idadeAlunoCadastrado.setIdade(idadeNovoDoAluno);
                    alunoDAO.atualizarAlunos(idadeAlunoCadastrado);
                    break;
                case 6:
                    System.out.print("Numero do aluno(ID): ");
                    idDoAluno = sc.nextInt();
                    System.out.print("Cidade novo: ");
                    sc.nextLine();
                    String cidadeNovoDoAluno = sc.nextLine();
                    Aluno cidadeAlunoCadastrado = alunoDAO.buscarPorId(idDoAluno);
                    cidadeAlunoCadastrado.setCidade(cidadeNovoDoAluno);
                    alunoDAO.atualizarAlunos(cidadeAlunoCadastrado);
                    System.out.print("Estado novo: ");
                    sc.nextLine();
                    String estadoNovoDoAluno = sc.nextLine();
                    Aluno estadoAlunoCadastrado = alunoDAO.buscarPorId(idDoAluno);
                    estadoAlunoCadastrado.setEstado(estadoNovoDoAluno);
                    alunoDAO.atualizarAlunos(estadoAlunoCadastrado);
                    break;
                case 7:
                    System.out.print("Numero do aluna a ser excluido(ID): ");
                    Integer idExcluir = sc.nextInt();
                    Aluno excluirAlunoCadastrado = alunoDAO.buscarPorId(idExcluir);
                    alunoDAO.excluirAlunos(excluirAlunoCadastrado);
                    break;
                default:
                    System.out.println("Programa encerrado");
                    break;
            }

        }while (opcao != 0);

        sc.close();
    }
}
