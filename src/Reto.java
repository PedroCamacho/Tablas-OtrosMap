import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		// Inicialización
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> numeros = new LinkedHashMap<>(10); //Numero-Frecuencia
		String numeroLargo;
		Integer digito;
		int cantidad;
		
		// Proceso
		System.out.print("Introduzca el número largo: ");
		numeroLargo = sc.next();
		for (int i = 0; i < numeroLargo.length(); i++) {
			digito = Character.getNumericValue(numeroLargo.charAt(i));
			cantidad = numeros.getOrDefault(digito, 0);
			numeros.put(digito, cantidad + 1);
		}

		// Salida
		for (Map.Entry<Integer, Integer> par : numeros.entrySet()) {
			System.out.println(par.getKey() + " -> " + par.getValue());
		}

	}
}
