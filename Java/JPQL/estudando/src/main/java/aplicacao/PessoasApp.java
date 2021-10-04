package aplicacao;

import modelo.Cidade;
import modelo.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class PessoasApp {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaConexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //fazer um select em toda a tabela Cidades
//        String jpql = "select c from Cidade c";
//        TypedQuery<Cidade> typedQuery = entityManager.createQuery(jpql, Cidade.class);
//        List<Cidade> listaCidade = typedQuery.getResultList();
//
//        for(Cidade cidade: listaCidade){
//            System.out.println(cidade.getNome());
//        }

        //fazendo uma consulta na tabela cidade pelo id
        String jpql = "select c from Cidade c where id = :id";
        int id = 2;

        TypedQuery<Cidade> typedQuery = entityManager.createQuery(jpql, Cidade.class).setParameter("id", id);
        List<Cidade> listaCidade = typedQuery.getResultList();

        for(Cidade cidade: listaCidade) {
            System.out.println(cidade.getNome());
        }

        entityManager.close();
        entityManagerFactory.close();

    }
}
