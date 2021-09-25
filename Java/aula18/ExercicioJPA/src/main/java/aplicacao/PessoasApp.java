package aplicacao;

import modelo.Cidade;
import modelo.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoasApp {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaConexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Cidade cidade1 = new Cidade();
//        cidade1.setNome("Sombrio");
//        cidade1.setUf("SC");
//
//        Cidade cidade2 = new Cidade();
//        cidade2.setNome("Criciuma");
//        cidade2.setUf("SC");
//
//        Cidade cidade3 = new Cidade();
//        cidade3.setNome("Arroio");
//        cidade3.setUf("SC");
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(cidade1);
//        entityManager.persist(cidade2);
//        entityManager.persist(cidade3);
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
        Cidade cidadeCadastrado = entityManager.find(Cidade.class, 1);
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Joao Lucas");
        pessoa1.setIdade(19);
        pessoa1.setRua("Pedro Coelho");
        pessoa1.setNumero("54");
        pessoa1.setBairro("Sao Jose");
        pessoa1.setCidade(cidadeCadastrado);

        entityManager.getTransaction().begin();
        entityManager.persist(pessoa1);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
