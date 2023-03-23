//------------comenzando con Herencias--------
//-----------------extiende de---------------

// NOS ENCONTRAMOS EN LA CLASE HIJA DE FUNCIONARIO.
public class Gerente extends Funcionario implements Autenticable{
	

	//SOBREESCRITURA DE METODO - REESCRIBIENDO EL METODO EN LA CLASE HIJA
	public double getBonificación() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		//Ahora el gerente gana el porcentaje aplicado al funcionario más su salario
		return 2000;
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
