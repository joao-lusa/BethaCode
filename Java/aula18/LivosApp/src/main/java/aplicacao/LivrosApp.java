package aplicacao;

import modelo.Livro;
import modelo.Tipo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LivrosApp {
    public static void main(String[] args) {
        EntityManagerFactory fabricaGerenciadorEntidades = Persistence.createEntityManagerFactory("minhaConexao");
        EntityManager geranciadorEntidades = fabricaGerenciadorEntidades.createEntityManager();

        //insersao de dados

//        Tipo tipo1 = new Tipo();
//        tipo1.setDescricao("Romance");
//
//        Tipo tipo2 = new Tipo();
//        tipo2.setDescricao("Historia");
//
//        Tipo tipo3 = new Tipo();
//        tipo3.setDescricao("Biografia");
//
//        geranciadorEntidades.getTransaction().begin();
//        geranciadorEntidades.persist(tipo1);
//        geranciadorEntidades.persist(tipo2);
//        geranciadorEntidades.persist(tipo3);
//        geranciadorEntidades.getTransaction().commit();
//
//        geranciadorEntidades.close();
//        fabricaGerenciadorEntidades.close();

        //Selecionar no banco de dados

//        Tipo tipoNoBanco = geranciadorEntidades.find(Tipo.class, 6);
//        System.out.println(tipoNoBanco);

        //update no banco de dados

//        Tipo tipoAtualizar = geranciadorEntidades.find(Tipo.class, 1);
//        tipoAtualizar.setDescricao("Romance saltess");
//
//        geranciadorEntidades.getTransaction().begin();
//        geranciadorEntidades.persist(tipoAtualizar);
//        geranciadorEntidades.getTransaction().commit();
//
//        geranciadorEntidades.close();
//        fabricaGerenciadorEntidades.close();

        //remover no banco de dados
//        Tipo tipoExcluir = geranciadorEntidades.find(Tipo.class, 1);
//
//        geranciadorEntidades.getTransaction().begin();
//        geranciadorEntidades.remove(tipoExcluir);
//        geranciadorEntidades.getTransaction().commit();
//        geranciadorEntidades.close();
//        fabricaGerenciadorEntidades.close();

        Tipo tipoCadastrado = geranciadorEntidades.find(Tipo.class, 2);
        Livro livro1 = new Livro();
        livro1.setTitulo("Harrey Potter e a Pedra Filosofal");
        livro1.setAutor("JK Rowling");
        livro1.setTipo(tipoCadastrado);

        geranciadorEntidades.getTransaction().begin();
        geranciadorEntidades.persist(livro1);
        geranciadorEntidades.getTransaction().commit();

        geranciadorEntidades.close();
        fabricaGerenciadorEntidades.close();



    }


}
