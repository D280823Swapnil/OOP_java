package assign_2_Q3;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date(28,05,1998);
		
		d.displayDate();
		d.setMonth(8);
		d.setYear(2015);
		d.setDay(17);
		d.displayDate();
		System.out.println("Day = "+d.getDay());
		System.out.println("Month = "+d.getMonth());
		System.out.println("Year = "+d.getYear());

		
	}


}
