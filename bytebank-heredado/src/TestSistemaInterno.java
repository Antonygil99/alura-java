
public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.auteticar(gerente1);
		sistema.auteticar(admin);
	}
}
