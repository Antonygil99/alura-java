
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setNombre("Diego");
		diego.setDocumento("445959");
		diego.setSalario(2000);
		
		System.out.println(diego.getSalario());
	}
}
