package basic;

public class AdditionalMainMethodKeywords {

	final synchronized strictfp public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Final: no Overriding by sub class");
		System.out.println("Sync:  2 tread cant use main methos simtutaously");
		System.out.println("stirtfp: Restriction to round off floatig point ");
	}

}
