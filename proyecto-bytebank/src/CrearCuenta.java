
public class CrearCuenta {
	public static void main(String[] args) {
		
	
	  //        Variable     |	  Valor
		cuenta primeraCuenta = new cuenta(); //2c7b84de
		
		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		cuenta segundaCuenta = new cuenta();
		segundaCuenta.depositar(3000); 
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(primeraCuenta.getSaldo());
	}

}
