
public class PruebaAcceso {
	public static void main(String[] args) {
		cuenta cuenta = new cuenta(222);
		cuenta.setAgencia(-2);
		cuenta.depositar(400);
		cuenta.retirar(300);

		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
		
		//Encapsulamiento - Modificadores de acceso
		//Private 
	}
}
