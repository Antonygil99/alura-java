
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//gerente.setSalario(5000);
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("AluraCurso");
		
		
		System.out.println(gerente.login("AluraCurso"));
		System.out.println(gerente.getBonificación());
	}
}
