package aplicacao;

import modelo.Livro;
import modelo.Tipo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class LivrosApp {
    public static void main(String[] args) {
        EntityManagerFactory fabricaGerenciadorEntidades = Persistence.createEntityManagerFactory("minhaConexao");
        EntityManager geranciadorEntidades = fabricaGerenciadorEntidades.createEntityManager();

        /*Query minhaQuery = geranciadorEntidades.createQuery("select l from Livro l");
        List<Livro> meusLivros = minhaQuery.getResultList();
        meusLivros.forEach(livro -> System.out.println(livro));*/

        /*Query minhaQuery = geranciadorEntidades.createQuery("select JJJ.titulo from Livro JJJ");
        List<String> meusTitulos = minhaQuery.getResultList();
        meusTitulos.forEach(titulo -> System.out.println(titulo));*/

        /*Query minhaQuery = geranciadorEntidades.createQuery("select l.anoPublicacao from Livro l");
        List<Integer> anosPublicacao = minhaQuery.getResultList();
        anosPublicacao.forEach(anoPub -> System.out.println(anoPub));*/

        /*Query minhaQueryn = geranciadorEntidades.createQuery("select l from Livro l where l.anoPublicacao >= 2000");
        List<Livro> meusLivros = minhaQueryn.getResultList();
        meusLivros.forEach(livro -> System.out.println(livro));*/

        /*Query minhaQuery = geranciadorEntidades.createQuery("select XX from Livro XX where XX.tipo.id = 2");
        List<Livro> meusLivros = minhaQuery.getResultList();
        meusLivros.forEach(livro -> System.out.println(livro));*/

        /*Query minhaQuery = geranciadorEntidades.createQuery("select AA from Livro AA where AA.tipo.id = :idTipo and AA.anoPublicacao < :ano");
        minhaQuery.setParameter("idTipo", 2);
        minhaQuery.setParameter("ano", 1990);
        List<Livro> meusLivros = minhaQuery.getResultList();
        meusLivros.forEach(livro -> System.out.println(livro));*/

        /*Query minhaQuery = geranciadorEntidades.createQuery("select l from Livro l");
        minhaQuery.setFirstResult(0);
        minhaQuery.setMaxResults(2);
        List<Livro> meusLivros = minhaQuery.getResultList();
        meusLivros.forEach(livro -> System.out.println(livro));*/

        geranciadorEntidades.close();
        fabricaGerenciadorEntidades.close();

    }
}
