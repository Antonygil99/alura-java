
public abstract class Funcionario {//al ser abstract deja de ser un objeto físico e instanceable
	private String nombre;
    private String Documento;
	private double Salario;
	private int tipo;
	
	
	//--------------Contructor----------------------------
	public Funcionario() {
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
	public abstract double getBonificación();

	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
}