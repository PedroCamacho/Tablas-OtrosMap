import java.util.TreeMap;

public class Ejemplo2 {

	public static void main(String[] args) {
		TreeMap<String, String> agenda = new TreeMap<>();
		
		agenda.put("Pedro", "+34-1234567");
		agenda.put("Luis", "+34-7654321");
		
		System.out.println("�Est� el tel�fono +34-1234567?: " + agenda.containsValue("+34-1234567"));
		agenda.remove("Pedro","+34-otro Numero");
		System.out.println("�Est� el tel�fono +34-1234567?: " + agenda.containsValue("+34-1234567"));
		agenda.remove("Pedro");
		System.out.println("�Est� el tel�fono +34-1234567?: " + agenda.containsValue("+34-1234567"));
		
		agenda.replace("Manuel", "+33-1111111");
		System.out.println("El tel�fono de Manuel es: " + agenda.getOrDefault("Manuel", "No est�"));
		
		agenda.replace("Luis", "+34-7654321", "+34-2222222");
		System.out.println("El tel�fono de Luis es: " + agenda.getOrDefault("Luis", "No est�"));
		
	}
}
