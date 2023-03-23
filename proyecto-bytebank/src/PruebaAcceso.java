
public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta Cuenta = new Cuenta(222);
		Cuenta.setAgencia(-2);
		Cuenta.depositar(400);
		Cuenta.retirar(300);

		System.out.println(Cuenta.getSaldo());
		System.out.println(Cuenta.getAgencia());
		
		//Encapsulamiento - Modificadores de acceso
		//Private 
	}
}
