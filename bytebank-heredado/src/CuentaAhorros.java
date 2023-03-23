
public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valorRecibido) {
		// TODO Auto-generated method stub
		this.saldo = this.saldo + valorRecibido;
	}
	

}
