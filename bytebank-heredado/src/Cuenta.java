//entidad cuenta:
public abstract class  Cuenta {
	
	protected double saldo;//encapsulamiento, nadie puede modificar directamente el saldo
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();//Referencia objetos no abstractos al ser Cuenta una clase madre asbtracta
	//contador de cuentas
	private static int total = 0;//static dice que esta variable no pertenece a la instancia

	
	
	//constructor nos obliga a brindar datos
	public Cuenta(int agencia, int numero) {//constructor desde aquí podemos manipular el objeto cuenta
		this.agencia=agencia;
		this.numero = numero;
//		if (agencia <= 0) {
//			System.out.println("No se permite 0");
//			this.agencia = 1;
//		}else {
//			this.agencia = agencia;
//		}
		
		System.out.println("Se han creado: " + (Cuenta.total+1) +" cuentas");
		Cuenta.total++;
		
	}
	
	public abstract void depositar (double valorRecibido);
//		//uso this
//		this.saldo = this.saldo + valorRecibido;
//		
//	}
	
	//Método con retorno
	public boolean retirar (double valorRecibido) {
		if (this.saldo >= valorRecibido) {
			this.saldo -= valorRecibido;
			return true;
			
		}
		else {
			 System.out.println("No puedes retirar más de: " + this.saldo);
			return false;
		}
			
	}
	
	public boolean transferir (double valorRecibido , Cuenta Cuenta) {
		if (this.saldo >= valorRecibido) {
			this.retirar(valorRecibido);
			//Referenciando objetos
			Cuenta.depositar(valorRecibido);//depositamos el valor a la cuenta deseada
			return true;
			
		}

		return false;

	}
	
	public double getSaldo() {//getter por converción el método debería llamarse getSaldo
		//para cambiar el nombre de un metodo en todos los proyectos seleccionamos refactor > rename
		
		return this.saldo;//variable encapsulada
	}
	
	public void setAgencia(int nuevaAgencia) {
		if (nuevaAgencia > 0) {
			this.agencia = nuevaAgencia;
		} else {
			System.out.println("No están permitido negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
}
