import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;


// Ejemplos de uso de Stream.
public class Ejemplo3App {

	public static void main(String[] args) {

		generaNumerosEnterosAleatorios();
		filtraMapeaYOrdenaNombres();


		Arrays.asList("a1", "a2", "a3")
	    .stream()
	    .findFirst()
	    .ifPresent(System.out::println);  // a1

	}

	private static void filtraMapeaYOrdenaNombres() {

		System.out.println("\n__________________________________________________________\n");

		List<String> listaNombres = Arrays.asList("david", "pedro", "daniel", "pascual", "francisco");

		listaNombres.stream().filter(s -> s.startsWith("d")) 				// Nombres que empiezan por d.
				.map(String::toUpperCase) 									// Los mapea a mayúsculas.
				.sorted() 													// Los ordena
				.forEach(System.out::println); 								// Los recorre e imprime.
	}

	private static void generaNumerosEnterosAleatorios() {
		// Uso de Stream para generar 5 números aleatorios de tipo entero.
		// :: es introducido en java 8 como referencia de método.
		Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
	}

}
