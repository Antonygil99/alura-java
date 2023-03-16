
public class TestIR2 {
	 public static void main(String[] args) {

	        double salario = 4300.0;
	        // ifs aqui
	        boolean puedeDeducirMonto142 = salario >= 1900.0 && salario <= 2800.0;
	        boolean puedeDeducirMonto350 = salario >= 2800.01 && salario <= 3571.0;
	        boolean puedeDeducirMonto636 = salario >= 3571.01 && salario <= 4664.0;
	        
	        if (puedeDeducirMonto142) 
				System.out.println("El IR es de 7.5% y puede deducir monto 142");
	        else if (puedeDeducirMonto350) 
	        	System.out.println("El IR es de 15% y puede deducir monto 350");
	        else if (puedeDeducirMonto636) 
	        	System.out.println("El IR es de 22% y puede deducir monto 350");
	        else
	        	System.out.println("No entras en el rango");
			

	    }

}
