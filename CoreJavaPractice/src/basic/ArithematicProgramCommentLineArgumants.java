package basic;

public class ArithematicProgramCommentLineArgumants {

	public static void main(String[] args) {
		System.out.println("Results of Arthematic Operation");
		int a= Integer.parseInt(args[0]);
		float b = Float.parseFloat(args[1]);
		System.out.println("The addition of two number: " + (a+b));
		System.out.println("The subraction of two number: "+ (a-b));
		System.out.println("The mul of two number: " + (a*b));
		System.out.println("The div of two number: " + (a/b));

	}

}
