
public class PruebaContructor {
	public static void main(String[] args) {
		//clase  		|   instancia
		cuenta cuenta =  new cuenta(555);
		cuenta cuenta2 = new cuenta(556);

		
		System.out.println(cuenta.getAgencia());
	}
}
