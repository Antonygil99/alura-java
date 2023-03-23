
public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean retirar(double valorRecibido) {
		double comision = 0.2;
		return super.retirar(valorRecibido + comision);
	}

	@Override
	public void depositar(double valorRecibido) {
		// TODO Auto-generated method stub
		
	}
	
}
