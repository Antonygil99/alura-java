
public class TestReferencia2 {
	
	public static void main(String[] args) {
		
		//solo creamos el cliente más no lo estamos referenciando a una cuenta
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "4555332";
		diego.telefono = "9995501342";
		
		//Al crear esta nueva cuenta llamada cuentaDeDiego
		cuenta cuentaDeDiego = new cuenta();
		cuentaDeDiego.agencia = 1;// asignamos el valor 1 a agencia de tipo int
		cuentaDeDiego.titular = diego;//Ahora si referenciamos los valores del objeto cliente a la cuenta de Diego
		
		System.out.println(cuentaDeDiego.titular.documento);
		System.out.println(cuentaDeDiego.titular);
		System.out.println(diego);
				
	}

}
