package streams;

import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class CreandoStreams {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<String> println = System.out::print;

		Stream<String> langs = Stream.of("Java ", "Rust ", "C ", "Kotlin\n");

		langs.forEach(print);

		String[] maisLangs = {"Rubi ", "Php ", "C#\n"};
		Stream.of(maisLangs).forEach(print);

		Arrays.stream(maisLangs).forEach(print);

		// o terceiro parametro não inclui ele mesmo, vai até um elemento antes
		Arrays.stream(maisLangs, 1, 2).forEach(print);

		List<String> outrasLang = Arrays.asList("C++ ", "Julya ", "Pearl\n");
		outrasLang.stream().forEach(print);

		// formas de gerar stream infinita
		// Stream.generate(() -> "a").forEach(print);
		// Stream.iterate(0, n -> n + 1).forEach(println);
	}
}