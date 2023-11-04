package assign9_q2;

/*
public class q2 {
	public static void main(String[] args) {
		String str = "this is string";
		String Words[] = str.split("\\s");
		String Result = new String();
		for (String Word : Words) {
			System.out.println(Word);
			Result = Result.concat(Word.substring(0, 1).toUpperCase());
			Result = Result.concat(Word.substring(1).toLowerCase());
			Result = Result.concat(" ");
		}
		System.out.println("Result:" + Result);
	}
}
*/

public class q2 {

	public static String title(String inputString) {
		StringBuilder str = new StringBuilder();
		String[] Words = inputString.split("\\s");
		for (String element : Words) {
			str.append(element.substring(0, 1).toUpperCase());
			str.append(element.substring(1).toLowerCase());
			str.append(" ");
		}
		String outputString = str.substring(0);
		return outputString;
	}

	public static void main(String[] args) {
		StringBuilder title = new StringBuilder();

	}
}