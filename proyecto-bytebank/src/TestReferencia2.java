
public class TestReferencia2 {
	
	public static void main(String[] args) {
		
		//solo creamos el cliente más no lo estamos referenciando a una cuenta
		Cliente diego = new Cliente();
		diego.setDocumento("Diego");
		diego.setDocumento("4555332"); 
		diego.setTelefono("9995501342"); 
		
		//Al crear esta nueva cuenta llamada cuentaDeDiego
		cuenta cuentaDeDiego = new cuenta(22);
		cuentaDeDiego.setAgencia(1);// asignamos el valor 1 a agencia de tipo int
		cuentaDeDiego.setTitular(diego);//Ahora si referenciamos los valores del objeto cliente a la cuenta de Diego
		
		System.out.println(diego.getDocumento());
		System.out.println(cuentaDeDiego.getTitular());
		System.out.println(diego);
				
	}

}
