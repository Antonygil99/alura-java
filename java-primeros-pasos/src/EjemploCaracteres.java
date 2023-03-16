
public class EjemploCaracteres {
	
	//ctrl + space keys
	public static void main(String[] args) {
		
		char caracter = 'a';
		System.out.println(caracter);
		
		// No se pueden usar mas de dos caracteres --> caracter = 'ab';
		//deacuerdo a la tabla de valores ASCII
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		System.out.println(caracter);
		
		//forzamos la suma de enteros a char
		char segundoChar = (char)(caracter + 1);
		System.out.println(segundoChar);
		
		//string no es una palabra reservada si no un objeto de java
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		//se forza el string automaticamente
		palabra = palabra + " 2020";
		System.out.println(palabra);
		
		
		
	}

}
