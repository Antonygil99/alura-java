
public class PruebaContructor {
	public static void main(String[] args) {
		//clase  		|   instancia
		Cuenta Cuenta =  new Cuenta(555);
		Cuenta cuenta2 = new Cuenta(556);

		
		System.out.println(Cuenta.getAgencia());
	}
}
