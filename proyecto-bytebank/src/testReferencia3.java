
public class testReferencia3 {
	
	public static void main(String[] args) {
		cuenta cuentaDeDiego = new cuenta(333);
		Cliente diego = new Cliente();
		//cuentaDeDiego.titular = cliente;
		
		//Referencias Inicialización
		cuentaDeDiego.setTitular(diego);//hacemos una referencia inicial y directa a un objeto del tipo cliente
		//el objeto cliente solo puede accederse a través de la cuenta iniciada ya que no se creó un objeto cliente específico
		diego.setNombre("Diego");
		System.out.println(cuentaDeDiego.getTitular().getNombre());
		
	}

}
