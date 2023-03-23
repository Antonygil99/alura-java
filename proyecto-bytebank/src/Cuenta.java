//entidad cuenta:
class  Cuenta {
	private double saldo;//encapsulamiento, nadie puede modificar directamente el saldo
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();//Referencia objetos
	//contador de cuentas
	private static int total = 0;//static dice que esta variable no pertenece a la instancia

	
	
	//constructor nos obliga a brindar datos
	public Cuenta(int agencia) {//constructor desde aquí podemos manipular el objeto cuenta

		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se han creado: " + total +" cuentas");
		
		
	}
	
	public void depositar (double valorRecibido){
		//uso this
		this.saldo = this.saldo + valorRecibido;
		
	}
	
	//Método con retorno
	public boolean retirar (double valorRecibido) {
		if (this.saldo >= valorRecibido) {
			this.saldo = this.saldo - valorRecibido;
			return true;
			
		}
		else {
			 System.out.println("No puedes retirar más de: " + this.saldo);
			return false;
		}
			
	}
	
	public boolean transferir (double valorRecibido , Cuenta Cuenta) {
		if (this.saldo >= valorRecibido) {
			this.saldo = this.saldo - valorRecibido;
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
