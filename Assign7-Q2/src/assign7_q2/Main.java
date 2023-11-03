package assign7_q2;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cricketer [] cricketers = new Cricketer[11];
		
		cricketers[0] = new Cricketer(1,"Niraj",22,6,50,75,0,0,0);
		cricketers[1] = new Cricketer(2,"Kshitij",25,8,80,100,0,0,0);
		cricketers[2] = new Cricketer(3,"Saurabh",18,10,123,123,0,0,0);
		cricketers[3] = new Cricketer(4,"Om",26,16,150,100,0,0,0);
		cricketers[4] = new Cricketer(5,"Abhi",27,36,30,75,0,0,0);
		cricketers[5] = new Cricketer(6,"Nikhil",25,54,0,0,0,24,10);
		cricketers[6] = new Cricketer(7,"Manthan",23,16,0,0,1,12,20);
		cricketers[7] = new Cricketer(8,"Gaurav",23,63,0,0,0,30,18);
		cricketers[8] = new Cricketer(9,"Rohit",24,34,0,0,2,24,25);
		cricketers[9] = new Cricketer(10,"Rahul",27,67,0,0,0,30,40);
		cricketers[10] = new Cricketer(11,"lobus",25,31,0,0,1,24,20);

//      code for user input
//		for(int i=0; i<11; i++) {
//			cricketers[i].accept(sc);
//		}
//		
		
		System.out.println("---------------------------------------------------------");
		System.out.println("No of Batters in Team are : "+ Players.countOfBatters(cricketers));
		System.out.println("---------------------------------------------------------");
		System.out.println("No of Bowlers in Team are : "+ Players.countOfBowlers(cricketers));
		System.out.println("---------------------------------------------------------");
		System.out.println("Total Batter Runs are : "+ Players.batterTotalRuns(cricketers));
		System.out.println("---------------------------------------------------------");
		System.out.println("Total Bowler Wickets are : "+ Players.bowlerTotalWickets(cricketers));
		System.out.println("---------------------------------------------------------");
		System.out.println("Batter with Maximum Runs is  : \n"+ Players.maxiRunsBatter(cricketers));
		System.out.println("---------------------------------------------------------");
		System.out.println("Bowler with Maximum Wickets is  : \n"+ Players.maxiWicketsBowler(cricketers));
		System.out.println("---------------------------------------------------------");

	}

}
