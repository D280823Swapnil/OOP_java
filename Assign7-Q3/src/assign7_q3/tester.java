package assign7_q3;

public class tester{

	public static void main(String[] args) throws CloneNotSupportedException {
					
		Person p1 = new Person("Niraj",23, 27, 12,2000);
		p1.display();
		Person p2 = (Person)p1.clone();
		p2.setAge(24);
		p2.getBirth().setDay(28);
		p1.display();
		p2.display();
	}
}
