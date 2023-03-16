
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		cuenta cuenta = new cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("hgsuhgin.pdf");
		
		cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());//referencia de titular al objeto cliente
		
	}
}
