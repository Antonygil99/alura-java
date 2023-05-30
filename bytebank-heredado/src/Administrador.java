
public class Administrador extends Funcionario implements Autenticable {
//el extends sive para ser hijo de un solo padre
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util= new AutenticacionUtil();
	}
	
	@Override 
	public double getBonificación() {
		return this.getSalario();
	}

@Override
public void setClave(String vclave) {
	// TODO Auto-generated method stub
	this.setClave(vclave);
	
}

@Override
public boolean login(String clave) {
	// TODO Auto-generated method stub
	return this.util.login(clave);
}

@Override
public double getBonificacion() {
	// TODO Auto-generated method stub
	return 0;
}

}
