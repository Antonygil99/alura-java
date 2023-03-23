
public class Administrador extends Funcionario {
	
	private String clave;
	
	public void setClave(String vclave) {
		this.clave = vclave;
	}
	
	public boolean login(String clave) {
		return clave == "AluraCurso";
	}
	@Override
	public double getBonificación() {
		// TODO Auto-generated method stub
		return 0;
	}

}
