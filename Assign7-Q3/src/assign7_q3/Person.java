package assign7_q3;

public class Person implements Cloneable{
	private String name;
	private int age;
	Date birth; 
	public Person() {
		
	}

	public Person(String name, int age, int day , int month , int year) {
		super();
		this.name = name;
		this.age = age;
		this.birth = new Date (day , month , year );
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display() {
		System.out.println("Name:"+name + "Age:"+age);
		birth.display();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person temp = (Person) super.clone();
		temp.birth = (Date) this.birth.clone();
		return temp;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

}
