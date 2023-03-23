
public class Administrador extends Funcionario implements Autenticable {
//el extends sive para ser hijo de un solo padre
	@Override 
	public double getBonificación() {
		return 0;
	}

@Override
public void setClave(String vclave) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean login(String clave) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public double getBonificacion() {
	// TODO Auto-generated method stub
	return 0;
}

}
