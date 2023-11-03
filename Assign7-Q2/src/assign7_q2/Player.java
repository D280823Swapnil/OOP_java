package assign7_q2;


public abstract class Player {
	int id;
	String name;
	int age;
	int matchesPlayed;
	
	public Player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	@Override
	public String toString() {
		return "Id : "+this.id+ "\nName : "+this.name+ "\nAge : "+ this.age+ "\nMatches Played "+ this.matchesPlayed;
	}
	
}
