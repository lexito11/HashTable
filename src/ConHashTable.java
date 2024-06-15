import java.util.HashMap;

class ConHashTable {

	public static void main(String[] args) {
		HashMap<String, Integer> persona = new HashMap<>();
		persona.put("Ana", 24);
		persona.put("Sara", 27);
		persona.put("Michael", 20);
		
        System.out.println("Personas y sus edades:");
        for (String nombre : persona.keySet()) {
            System.out.println(nombre + ": " + persona.get(nombre));
        }



	}

}
