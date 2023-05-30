import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists_MetodosAdicionales {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String curso1 = "Geometría";
		String curso2 = "Física";
		String curso3 = "Química";
		String curso4 = "Historia";
		
		ArrayList<String> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		//Método de ordenamiento de menor a mayor Ascendente con la clase collection
		Collections.sort(cursos);
		System.out.println(cursos);
		//Método de ordenamiento de menor a mayor Descendente
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);
		
	}
}
