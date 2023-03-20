
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		ControlBonificacion controlbonificacion = new ControlBonificacion();
		
		controlbonificacion.registrarSalario(diego);
		controlbonificacion.registrarSalario(jimena);
		controlbonificacion.registrarSalario(alexis);
		
		
	}
}
