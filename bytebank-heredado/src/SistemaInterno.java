
public class SistemaInterno {
	
	private String clave = "12345";
	
	public boolean auteticar(FuncionarioAutenticar gerente) {
		boolean puedeIniciarSesion = gerente.login(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}
		else {
			System.out.println("Error login");
			return false;
		}
		
	}
}
