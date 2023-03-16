
public class Gerente {
	private String nombre;
    private String Documento;
	private double Salario;
	
	
	//--------------Contructor----------------------------
	public Gerente() {
		// TODO Auto-generated constructor stub
	}
	//------------- getters and setters declared----------


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDocumento() {
		return Documento;
	}


	public void setDocumento(String documento) {
		Documento = documento;
	}


	public double getSalario() {
		return Salario;
	}


	public void setSalario(double salario) {
		Salario = salario;
	}
	
	//Bonificacion del 10%
	public double getBonificación() {
		return this.Salario;
	}
	
}
