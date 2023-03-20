
public class ControlBonificacion {
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificación() + this.suma;
		System.out.println("calculo actual: " + this.suma);
		return this.suma;
	}
	public double registrarSalario(Gerente gerente) {
		this.suma = gerente.getBonificación() + this.suma;
		System.out.println("calculo actual: " + this.suma);
		return this.suma;
	}
}
