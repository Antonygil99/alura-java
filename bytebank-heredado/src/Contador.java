
public class Contador extends Funcionario{
	//La palabra Funcionario es un objeto abstracto
	@Override
	public double getBonificación() {
		System.out.println("EJECUTANDO DESDE CONTADOR");
		return 200;
	}
}
