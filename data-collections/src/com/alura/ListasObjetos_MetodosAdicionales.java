package com.alura;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListasObjetos_MetodosAdicionales {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Ruby", 30);
		Curso curso2 = new Curso("PHP", 10);
		Curso curso3 = new Curso("JavaScript", 20);
		Curso curso4 = new Curso("C", 50);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		/*Para ser capaz de ordenar una lista de objetos es necesario 
		implementar la interfaz colaborable que ya implementa el objeto Collections
		e implementar los metodos de la interfaz en la clase correspondiente.
		*/
		Collections.sort(cursos);
		System.out.println(cursos);
		
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);
		
		

		
	}
}
