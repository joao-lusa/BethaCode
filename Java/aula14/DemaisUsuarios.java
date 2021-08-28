package aula14;

public class DemaisUsuarios implements Usuarios {

	@Override
	public boolean definirSenha(String senha) {
		if(senha.trim().length() < 4) {
			return false;
		}
		return true;
	}

}
