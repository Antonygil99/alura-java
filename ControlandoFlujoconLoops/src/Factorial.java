
public class Factorial {
	public static void main(String[] args) {
		
		int fact = 1;
		for(int num = 1; num < 11; num++) {
			fact *= num;
			System.out.println("El factorial de "+ num + " es: "+fact);
		}
	}

}
