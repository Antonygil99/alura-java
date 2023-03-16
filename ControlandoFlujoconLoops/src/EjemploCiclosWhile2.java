
public class EjemploCiclosWhile2 {
	
	public static void main(String[] args) {
		
		int count = 0;
		int suma = 0;
		
		while(count <= 10) {
			suma = suma + count; 
			count ++;
		}
		System.out.println("la suma de todos los números es: "+suma);

	}

}
