package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
		
		Country country1 = new Country("Canada", "English", true);
		Country country2 = new Country("Nigeria", "English", false);
		Country country3 = new Country("Brazil", "Portuguese", false);
		Country country4 = new Country("Australia", "English", true);
		Country country5 = new Country("Germany", "German", true);
		Country country6 = new Country("Russia", "Russian", true);

		//filtra os pais que não são ricos e imprime os ricos que falam ingles
		List<Country> countries = Arrays.asList(country1, country2, country3, country4, country5, country6);

		Predicate<Country> rico = country -> country.isRich;
		Predicate<Country> falaIngles = country -> country.lang.equalsIgnoreCase("english");

		countries.stream()
			.filter(rico)
			.filter(falaIngles)
			.map((country) -> country.name + " fala ingles e é rico!")
			.forEach(System.out::println);
    }
}
