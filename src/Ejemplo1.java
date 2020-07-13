import java.util.LinkedHashMap;
import java.util.Map;

public class Ejemplo1 {

	public static void main(String[] args) {
		Map<String, Integer> carrito = new LinkedHashMap<>();
		
		carrito.put("pan", 1);
		carrito.put("leche", 1);
		carrito.put("cereales", 1);
		
		System.out.println("Cantidad de pan: " + carrito.putIfAbsent("pan", 2));
		System.out.println(carrito);
		System.out.println("Cantidad de huevos: " + carrito.putIfAbsent("huevos", 1));
		System.out.println(carrito);
		
		System.out.println("Total de leche: " + carrito.getOrDefault("leche", 0));
		System.out.println("Total de agua: " + carrito.getOrDefault("agua", 0));
		
	}
}
