
public class EjemploCondicionales2 {
	public static void main(String[] args) {
	     System.out.println("probando condicionales");

	        int edad = 21;
	        int cantidadPersonas = 2;
	        
	        boolean esPareja = cantidadPersonas > 1;
	        boolean puedeEntrar = edad >= 18 && esPareja;
	        
	        System.out.println("Valor condicion es: "+esPareja);
	        System.out.println("Valor condicion es: "+puedeEntrar);

	        if (puedeEntrar) {
	            System.out.println("Usted puede entrar");
	        } else {

	            System.out.println("Usted no esta permitido entrar a"
	                		+" entrar"); 
	        }

	}
}
