
public class Contador extends Funcionario{
	@Override
	public double getBonificación() {
		System.out.println("EJECUTANDO DESDE CONTADOR");
		return 200;
	}
}
