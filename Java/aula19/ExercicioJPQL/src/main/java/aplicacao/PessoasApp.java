package aplicacao;

import modelo.Cidade;
import modelo.Pessoa;

import javax.management.QueryEval;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class PessoasApp {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaConexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /*Query minhaQuery = entityManager.createQuery("select l from Pessoa l");
        List<Pessoa> minhasPessoas = minhaQuery.getResultList();
        minhasPessoas.forEach(pessoa -> System.out.println(pessoa));*/

        /*Query minhaQuery = entityManager.createQuery("select N.nome from Pessoa N");
        List<String> minhasPessoas = minhaQuery.getResultList();
        minhasPessoas.forEach(pessoa -> System.out.println(pessoa));*/

        /*Query minhaQuery = entityManager.createQuery("select l from Pessoa l where l.nome = 'Joao Lucas'");
        List<Pessoa> minhasPessoas = minhaQuery.getResultList();
        minhasPessoas.forEach(pessoa -> System.out.println(pessoa));*/

        /*Query minhaQuery = entityManager.createQuery("select l from Pessoa l where l.Idade = 19");
        List<Pessoa> minhasPessoas = minhaQuery.getResultList();
        minhasPessoas.forEach(pessoa -> System.out.println(pessoa));*/

        /*Query minhaQuery = entityManager.createQuery("select l from Pessoa l where l.cidade = 3");
        List<Pessoa> minhasPessoas = minhaQuery.getResultList();
        minhasPessoas.forEach(pessoa -> System.out.println(pessoa));*/

        Query minhaQuery = entityManager.createQuery("select l from Pessoa l where l.rua = 'Pedro Coelho' and l.bairro = 'Sao Jose'");
        List<Pessoa> minhasPessoas = minhaQuery.getResultList();
        minhasPessoas.forEach(pessoa -> System.out.println(pessoa));

        entityManager.close();
        entityManagerFactory.close();

    }
}
