package generics;

import java.util.List;
import java.util.Arrays;

public class ListaUtilTeste {
    public static void main(String[] args) {
		List<String> langs = Arrays.asList("Java", "C#", "PHP", "Go");
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);

		Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero1);

		String ultimaLinguagem2 = ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem2);

		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo1(nums);
		System.out.println(ultimoNumero2);

	}
}
