package assign9_q2;

public class q1 {
	public static void main(String[] args) {
		String Bank = "Bank Of Maharashtra";
		String parts[] = Bank.split("\\s");
		System.out.println("Bank :" + Bank);
		String Result = new String();
		for (String part : parts) {
			System.out.println("part=" + part);
			Result = Result.concat(part.substring(0, 1));
		}
		System.out.println("Result: " + Result);
	}
}
