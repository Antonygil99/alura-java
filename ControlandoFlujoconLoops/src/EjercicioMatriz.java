import java.util.Iterator;

public class EjercicioMatriz {
	public static void main(String[] args) {
		
		for (int fila = 0; fila <= 10;fila++) {
			
			for (int col = 0; col <= fila; col++) {
				
//				if (col > fila) {
//					break;
//				}
				
				System.out.print(col+1);
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
