package aula14;

public class Administrador implements Usuarios{

	@Override
	public boolean definirSenha(String senha) {
		if(senha.trim().length() < 8) {
			return false;
		}
		return true;
	}
	
}
