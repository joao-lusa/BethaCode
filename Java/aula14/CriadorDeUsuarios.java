package aula14;

public class CriadorDeUsuarios {
	public static void main(String[] args) {
		
		Administrador admin = new Administrador();
		
		if(admin.definirSenha("12345678")) {
			System.out.println("senha alterada com sucesso");
		}else {
			System.out.println("senha não contempla requisitos minimos (8 caracters)");
		}
		
		System.out.println("_===============================================_");
		
		DemaisUsuarios operacao = new DemaisUsuarios();
		if(operacao.definirSenha("1234")) {
			System.out.println("senha alterada com sucesso");
		}else {
			System.out.println("senha não contempla requisitos minimos (8 caracters)");
		}
	
	}
}
