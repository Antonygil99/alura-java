import java.util.ArrayList;

public class ArrayLists_Conociendo {
	public static void main(String[] args) {
		
		String variable1 = "Ejemplo 1";
		String variable2 = "Ejemplo 2";
		String variable3 = "Ejemplo 3";
		String variable4 = "Ejemplo 4";
		
		//ArrayList<Tipo de variable(int, String, boolean, etc...)>
		ArrayList<String> list = new ArrayList<>();
		list.add(variable1);
		list.add(variable2);
		list.add(variable3);
		list.add(variable4);
		System.out.println(list);
	}
}
