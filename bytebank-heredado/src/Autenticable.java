
public abstract interface Autenticable extends Funcionario {
	private String clave;
	
	public void setClave(String vclave);
	
	public boolean login(String clave) {
		return clave == "12345";
	}

	@Override
	public double getBonificación() {
		// TODO Auto-generated method stub
		return 0;
	}
}
