
public class Administrador extends Funcionario implements Autenticable {
//el extends sive para ser hijo de un solo padre
	private String clave;
	
	@Override 
	public double getBonificación() {
		return this.getSalario();
	}

@Override
public void setClave(String vclave) {
	// TODO Auto-generated method stub
	this.clave=vclave;
	
}

@Override
public boolean login(String clave) {
	// TODO Auto-generated method stub
	return this.clave==clave;
}

@Override
public double getBonificacion() {
	// TODO Auto-generated method stub
	return 0;
}

}
