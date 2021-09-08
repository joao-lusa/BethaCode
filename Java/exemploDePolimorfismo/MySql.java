package exemploDePolimorfismo;

public class MySql implements BancoDeDados{
	@Override
	public void conectaNoBanco() {
		 if(validaSenha("admin", "123456")) {
			 System.out.println("conectado com sucesso");
		 }else {
			 System.out.println("erro ao conectar no banco");
		 }
		 carregarLibsMongoDB();
	}
	public boolean validaSenha(String usuario, String senha) {
		if("admin".equals(usuario) && ("123456").equals(senha)) {
			return true;
		}else {
			return false;
		}
	}
	public void carregarLibsMongoDB() {
		 System.out.println("Carregou as dlls no banco MongoDB noSQL!!!");
	}
}
