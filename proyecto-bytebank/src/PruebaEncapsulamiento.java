
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta Cuenta = new Cuenta(33);
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("hgsuhgin.pdf");
		
		Cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(Cuenta.getTitular().getNombre());//referencia de titular al objeto cliente
		
	}
}
