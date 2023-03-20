
public class TestReferencias {
	public static void main(String[] args) {
		//El elemento mas generico puede ser adaptado al elemento mas
		//especifico
		//Funcionario funcionario = new Funcionario();
		Funcionario funcionario = new Gerente();//pero no hereda los metodos del hijo 
		funcionario.setNombre("Diego");
		
		Gerente gerente =  new Gerente();
		gerente.setNombre("Ximena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);

		
	}
}
