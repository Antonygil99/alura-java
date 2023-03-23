
public interface Autenticable {

	public abstract void setClave(String vclave);
	
	public abstract boolean login(String clave);
	
	public double getBonificacion();
	

}
