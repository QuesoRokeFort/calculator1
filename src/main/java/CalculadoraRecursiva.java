import java.util.Scanner;

public class CalculadoraRecursiva {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una expresión matemática: ");
		String expresion = scanner.nextLine();

		double resultado = evaluarExpresion(expresion);

		System.out.println("Resultado: " + resultado);

		scanner.close();
	}

	public static double evaluarExpresion(String expresion) {
		expresion = expresion.replaceAll(" ", ""); // Eliminar espacios en blanco
		return evaluarSumaResta(expresion);
	}

	public static double evaluarSumaResta(String expresion) {
		int indice = expresion.lastIndexOf('+');
		if (indice != -1) {
			double izquierda = evaluarSumaResta(expresion.substring(0, indice));
			double derecha = evaluarMultiplicacionDivision(expresion.substring(indice + 1));
			return izquierda + derecha;
		}
		indice = expresion.lastIndexOf('-');
		if (indice != -1) {
			double izquierda = evaluarSumaResta(expresion.substring(0, indice));
			double derecha = evaluarMultiplicacionDivision(expresion.substring(indice + 1));
			return izquierda - derecha;
		}
		return evaluarMultiplicacionDivision(expresion);
	}

	public static double evaluarMultiplicacionDivision(String expresion) {
		int indice = expresion.lastIndexOf('x');
		if (indice != -1) {
			double izquierda = evaluarMultiplicacionDivision(expresion.substring(0, indice));
			double derecha = evaluarFactor(expresion.substring(indice + 1));
			return izquierda * derecha;
		}
		indice = expresion.lastIndexOf('/');
		if (indice != -1) {
			double izquierda = evaluarMultiplicacionDivision(expresion.substring(0, indice));
			double derecha = evaluarFactor(expresion.substring(indice + 1));
			return izquierda / derecha;
		}
		return evaluarFactor(expresion);
	}

	public static double evaluarFactor(String expresion) {
		int longitud = expresion.length();
		if (longitud == 0) {
			return 0;
		}
		if (expresion.charAt(0) == '(' && expresion.charAt(longitud - 1) == ')') {
			return evaluarSumaResta(expresion.substring(1, longitud - 1));
		} else {
			return Double.parseDouble(expresion);
		}
	}
}
