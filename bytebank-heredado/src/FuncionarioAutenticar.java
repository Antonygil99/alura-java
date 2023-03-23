
public class FuncionarioAutenticar {
	private String clave;
	
	public void setClave(String vclave) {
		this.clave = vclave;
	}
	
	public boolean login(String clave) {
		return clave == "12345";
	}
}
