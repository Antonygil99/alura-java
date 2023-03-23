//------------comenzando con Herencias--------
//-----------------extiende de---------------

// NOS ENCONTRAMOS EN LA CLASE HIJA DE FUNCIONARIO.
public class Gerente extends FuncionarioAutenticar{
	

	//SOBREESCRITURA DE METODO - REESCRIBIENDO EL METODO EN LA CLASE HIJA
	public double getBonificación() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		//Ahora el gerente gana el porcentaje aplicado al funcionario más su salario
		return 2000;
	}
}
