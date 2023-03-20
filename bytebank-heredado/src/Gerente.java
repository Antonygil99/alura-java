//------------comenzando con Herencias--------
//-----------------extiende de---------------

// NOS ENCONTRAMOS EN LA CLASE HIJA DE FUNCIONARIO.
public class Gerente extends Funcionario{
	
	private String clave;
	
	public void setClave(String vclave) {
		this.clave = vclave;
	}
	
	public boolean login(String clave) {
		return clave == "AluraCurso";
	}
	//SOBREESCRITURA DE METODO - REESCRIBIENDO EL METODO EN LA CLASE HIJA
	public double getBonificación() {
		//Ahora el gerente gana el porcentaje aplicado al funcionario más su salario
		return super.getSalario() + super.getBonificación();
	}
}
