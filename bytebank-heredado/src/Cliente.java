
public class Cliente implements Autenticable{
	private String nombre;
	private String documento;
	private String telefono;
	
	private String clave;
	
	//generamos getter y setters desde la pestaña Source de eclipse
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public void setClave(String vclave) {
		// TODO Auto-generated method stub
		this.clave=vclave;
		
	}
	@Override
	public boolean login(String clave) {
		// TODO Auto-generated method stub
		if (this.clave==clave) {
			return true;
		}
		return false;
	}
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
