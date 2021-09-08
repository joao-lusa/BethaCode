package exemploDePolimorfismo;


public class MinhaAplicacao {
	public static void main(String[] args) {
		System.out.println("Bem vindo a nossa aplicação");
		System.out.println("Conetando ao banco de dados...");
		Oracle oracleBanco = new Oracle();
		conectaNoBanco(oracleBanco);
		
	}
	public static void conectaNoBanco(BancoDeDados meuBanco) {
		meuBanco.conectaNoBanco();
	}
}
