
public class pruebaMetodos {
	public static void main(String[] args) {
		
		//implementación de método
		cuenta miCuenta = new cuenta();
		miCuenta.depositar(300); //ahora yo tengo 300 
		miCuenta.depositar(200);// ahora tengo 300 + 200 = 500
		System.out.println(miCuenta.getSaldo());// imprime 500
		
		//Referenciando objetos
		miCuenta.retirar(600);//Muestra un mensaje de error por no contar con el salo suficiente
		//el valor a retirar es mayor al valor del saldo de mi cuenta
		System.out.println(miCuenta.getSaldo());
		
		cuenta cuentaDeJimena = new cuenta();//Creo una nueva cuenta
		cuentaDeJimena.depositar(1000);//Jimena tiene 1000
		cuentaDeJimena.transferir(200, miCuenta);//Jimena me transfiere 200
		System.out.println("Jimena tiene: " + cuentaDeJimena.getSaldo());//Jimena tiene 800
		System.out.println("Mi cuenta tiene: " + miCuenta.getSaldo());//Yo tengo 700, ya que anteriormente contaba con 500.
	}
}
