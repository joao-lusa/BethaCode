package DAO;

import conexao.ConexaoJDBC;
import model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private Connection minhaConexao;

    public AlunoDAO(){
        this.minhaConexao = ConexaoJDBC.getConnection();
    }

    public void criarAluno(Aluno novoAluno){
        String meuSql = "insert into alunos(nome, idade, cidade, estado) values(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = minhaConexao.prepareStatement(meuSql);
            preparedStatement.setString(1, novoAluno.getNome());
            preparedStatement.setInt(2, novoAluno.getIdade());
            preparedStatement.setString(3, novoAluno.getCidade());
            preparedStatement.setString(4, novoAluno.getEstado());
            int linhaInserida = preparedStatement.executeUpdate();
            System.out.println("Adicionado novo aluno! Iserida "+ linhaInserida + " Linha(s).");
        }catch (SQLException e){
            System.out.println("Erro do cando de dados: " + e.getMessage());
        }
    }

    public List<Aluno> buscarAlunos(){
        List<Aluno> alunosCadastrados = new ArrayList<>();
        String meuSql = "select * from alunos";
        try {
            PreparedStatement preparedStatement = minhaConexao.prepareStatement(meuSql);
            ResultSet resultadoSql = preparedStatement.executeQuery();
            while (resultadoSql.next()){
                Aluno cadastrado = new Aluno();
                cadastrado.setId(resultadoSql.getInt("id"));
                cadastrado.setNome(resultadoSql.getString("nome"));
                cadastrado.setIdade(resultadoSql.getInt("idade"));
                cadastrado.setCidade(resultadoSql.getString("cidade"));
                cadastrado.setEstado(resultadoSql.getString("estado"));
                alunosCadastrados.add(cadastrado);
            }
        }catch (SQLException e){
            System.out.println("Erro no banco de dados: " + e.getMessage());
        }
        return alunosCadastrados;
    }
    public Aluno buscarPorId(int id){
        Aluno alunoCadastrado = new Aluno();
        String meuSql= "select * from alunos where id = ?";
        try {
            PreparedStatement preparedStatement = minhaConexao.prepareStatement(meuSql);
            preparedStatement.setInt(1,id);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()){
                alunoCadastrado.setId(resultado.getInt("id"));
                alunoCadastrado.setNome(resultado.getString("nome"));
                alunoCadastrado.setIdade(resultado.getInt("idade"));
                alunoCadastrado.setCidade(resultado.getString("cidade"));
                alunoCadastrado.setEstado(resultado.getString("estado"));
            }
        }catch (SQLException e){
            System.out.println("Erro com banco de dados: " + e.getMessage());
        }

        return alunoCadastrado;
    }

    public void atualizarAlunos(Aluno novoAluno){
        String meuSql = "update alunos set nome = ?, idade = ?, cidade = ?, estado = ? where id = ?";
        try {
            PreparedStatement preparedStatement = minhaConexao.prepareStatement(meuSql);
            preparedStatement.setString(1, novoAluno.getNome());
            preparedStatement.setInt(2, novoAluno.getIdade());
            preparedStatement.setString(3, novoAluno.getCidade());
            preparedStatement.setString(4, novoAluno.getEstado());
            preparedStatement.setInt(5, novoAluno.getId());
            int atualizados = preparedStatement.executeUpdate();
            System.out.println("Aluno: "+ novoAluno.getId()+ " Atualizado com sucesso");
        }catch (SQLException e){
            System.out.println("Erro do cando de dados: " + e.getMessage());
        }
    }

    public void excluirAlunos(Aluno novoAluno){
        String meuSql = "delete from alunos where id = ?";
        try {
            PreparedStatement preparedStatement = minhaConexao.prepareStatement(meuSql);
            preparedStatement.setInt(1, novoAluno.getId());

            int excluido = preparedStatement.executeUpdate();
            System.out.println("Aluno: "+ novoAluno.getId()+" excluido com sucesso");
        }catch (SQLException e){
            System.out.println("Erro na atualização de dados " + e.getMessage());
        }
    }
}
