
public class MultiplosdeTres {
	public static void main(String[] args) {
		
		System.out.println("Los multiplos de 3 son: ");
		
		for (int count = 0; count <= 100; count++) {
			
			int mult = count%3;
			if(mult == 0) {
				System.out.println(count);
			}
		}
	}

}
