
public class testReferencia {
	public static void main(String[] args) {
		cuenta primeraCuenta = new cuenta(16);
		primeraCuenta.depositar(200); 
		
		cuenta SegundaCuenta = primeraCuenta;
		SegundaCuenta.depositar(100);
		
		System.err.println("Saldo primera cuenta: " 
		+ primeraCuenta.getSaldo());
		
		System.err.println("Saldo segunda cuenta: " 
				+ SegundaCuenta.getSaldo());
		
		SegundaCuenta.depositar(400); 
		System.err.println("Saldo primera cuenta: " 
				+ primeraCuenta.getSaldo());
		
		System.err.println("Saldo segunda cuenta: " 
				+ SegundaCuenta.getSaldo());
	}
}
