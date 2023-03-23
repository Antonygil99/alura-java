
public class FuncionarioAutenticar extends Funcionario {
	private String clave;
	
	public void setClave(String vclave) {
		this.clave = vclave;
	}
	
	public boolean login(String clave) {
		return clave == "12345";
	}

	@Override
	public double getBonificación() {
		// TODO Auto-generated method stub
		return 0;
	}
}
