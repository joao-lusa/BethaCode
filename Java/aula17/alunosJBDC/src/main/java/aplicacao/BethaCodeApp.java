package aplicacao;

import DAO.AlunoDAO;
import conexao.ConexaoJDBC;
import model.Aluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class BethaCodeApp {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();
        //adicionar aluno novo
//        Aluno aluno01 = new Aluno("Joao Lucas Pereira Rafael", 19, "Sombrio", "SC");
//        alunoDAO.criarAluno(aluno01);
//        Aluno aluno02 = new Aluno("Otavio", 20, "TC", "RS");
//        alunoDAO.criarAluno(aluno02);

//        //buscar todos os alunos cadastrados
//       List<Aluno> alunosCadastrados = alunoDAO.buscarAlunos();
//       alunosCadastrados.forEach(aluno -> System.out.println(aluno));

        //buscar por id
//        Aluno alunoCadastrado = alunoDAO.buscarPorId(2);
//        System.out.println(alunoCadastrado);

        //Busca aluno por id, altera a cidade
//        Aluno alunoCadastrado = alunoDAO.buscarPorId(2);
//        alunoCadastrado.setCidade("Criciúma");
//        alunoDAO.atualizarAlunos(alunoCadastrado);

        //Buca aluno por id, e exclui no banco
//        Aluno alunoCadastrado = alunoDAO.buscarPorId(2);
//        alunoDAO.excluirAlunos(alunoCadastrado);

    }
}
