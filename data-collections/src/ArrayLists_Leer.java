import java.util.ArrayList;

public class ArrayLists_Leer {
	public static void main(String[] args) {
		
		String variable1 = "Ejemplo 1";
		String variable2 = "Ejemplo 2";
		String variable3 = "Ejemplo 3";
		String variable4 = "Ejemplo 4";
		
		//ArrayList<Tipo de variable(int, String, boolean, etc...)>
		ArrayList<String> listString = new ArrayList<>();
		
		listString.add(variable1);
		listString.add(variable2);
		listString.add(variable3);
		listString.add(variable4);
		System.out.println(listString);
		
		//leyendo con un for común
		System.out.println("Lista leída con for común");
		for(int i = 0; i<listString.size(); i++) {
			System.out.println(listString.get(i));
		}
		
		
		//leyendo con un foreach
		System.out.println("\n");
		System.out.println("Lista leída con foreach");
		for (String clase : listString) {
			System.out.println(clase);
		}
		//leyendo el método foreach del objeto ArrayList<>
		System.out.println("\n");
		System.out.println("Lista leída con el método foreach");
		listString.forEach(clase -> {
			System.out.println(clase);
		});
		
		
		
	}
}
