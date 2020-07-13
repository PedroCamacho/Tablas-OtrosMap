import java.util.TreeMap;

public class Ejemplo2 {

	public static void main(String[] args) {
		TreeMap<String, String> agenda = new TreeMap<>();
		
		agenda.put("Pedro", "+34-1234567");
		agenda.put("Luis", "+34-7654321");
		
		System.out.println("¿Está el teléfono +34-1234567?: " + agenda.containsValue("+34-1234567"));
		agenda.remove("Pedro","+34-otro Numero");
		System.out.println("¿Está el teléfono +34-1234567?: " + agenda.containsValue("+34-1234567"));
		agenda.remove("Pedro");
		System.out.println("¿Está el teléfono +34-1234567?: " + agenda.containsValue("+34-1234567"));
		
		agenda.replace("Manuel", "+33-1111111");
		System.out.println("El teléfono de Manuel es: " + agenda.getOrDefault("Manuel", "No está"));
		
		agenda.replace("Luis", "+34-7654321", "+34-2222222");
		System.out.println("El teléfono de Luis es: " + agenda.getOrDefault("Luis", "No está"));
		
	}
}
