package exemploDePolimorfismo;

public class Oracle implements BancoDeDados{

	@Override
	public void conectaNoBanco() {
		 if(validaSenha("admin", "admim")) {
			 System.out.println("conectado com sucesso");
		 }else {
			 System.out.println("erro ao conectar no banco");
		 }
	}
	public boolean validaSenha(String usuario, String senha) {
		if("admin".equals(usuario) && ("admin").equals(senha)) {
			return true;
		}else {
			return false;
		}
	}

}
