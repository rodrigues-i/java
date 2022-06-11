public class Wrapper {

	public static void main(String[] args) {

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);

		Float f = 250F;
		System.out.println(f);

		Double d = 454.454;
		System.out.println(d);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);

		Character c = '#';
		System.out.println(c);
	}
}