import java.util.Scanner;
import com.google.gson.*;
public class Principal {
	public static void main(String[] args) {
		String nombre, apellidos;
		int edad;
		Scanner sc;
		
		System.out.println("Introducir nombre de la persona: ");
		sc = new Scanner(System.in);
		nombre = sc.nextLine();
		System.out.println("Introducir apellido de la persona");
		sc = new Scanner(System.in);
		apellidos = sc.nextLine();
		System.out.println("Introducir edad de la persona: ");
		sc= new Scanner(System.in);
		edad = sc.nextInt();
		Persona p = new Persona(nombre, apellidos, edad);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}
}
