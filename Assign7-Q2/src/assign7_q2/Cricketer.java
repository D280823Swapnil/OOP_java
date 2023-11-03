package assign7_q2;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler{
	int runsScored;
	int wickets;
	int ballsPlayed;
	int ballsBowled;
	int runsGiven;
	
	public Cricketer(int id, String name, int age, int matchesPlayed,int runsScored,  int ballsPlayed,int wickets, int ballsBowled, int runsGiven) {
		super(id, name, age, matchesPlayed);
		this.runsScored = runsScored;
		this.wickets = wickets;
		this.ballsPlayed = ballsPlayed;
		this.ballsBowled = ballsBowled;
		this.runsGiven = runsGiven;
	}
	
	@Override
	public double getAverage() {
		double avg = this.runsScored/ this.ballsPlayed;
		return avg;
	}
	@Override
	public double getEconomy() {
		double eco = (this.runsGiven/ (this.ballsBowled/6));
		return eco;
	}
	@Override
	public int getRuns() {
		
		return this.runsScored;
	} 
	@Override
	public double getStrikeRate() {
		
		return this.getAverage()/100;
	} 
	@Override
	public int getWickets() {
		
		return this.wickets;
	}
	
	public int getBallsPlayed() {
		return this.ballsPlayed;
	}
	
	public int getBallsBowled() {
		return this.ballsBowled;
	}
	
	public int getRunsGiven() {
		return runsGiven;
	}

	public void setRunsGiven(int runsGiven) {
		this.runsGiven = runsGiven;
	}

	public void accept(Scanner sc) {
		
		System.out.println("------------------------");
		System.out.print("Enter Cricketer Id ");
		this.id = sc.nextInt();
		
		System.out.print("Enter Cricketer Name ");
		this.name = sc.next();
		
		System.out.print("Enter Cricketer age ");
		this.age = sc.nextInt();
		
		System.out.print("Enter Matches Played ");
		this.matchesPlayed = sc.nextInt();
		
		System.out.print("Enter Runs Scored ");
		this.runsScored = sc.nextInt();
		
		System.out.print("Enter Balls Played ");
		this.ballsPlayed = sc.nextInt();
		
		System.out.print("Enter Wickets Taken ");
		this.wickets = sc.nextInt();
		
		System.out.print("Enter Balls Bowled ");
		this.ballsBowled = sc.nextInt();
		
		System.out.print("Enter Runs Given ");
		this.runsGiven = sc.nextInt();
		System.out.println("------------------------");
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\nRuns Scored : "+ this.runsScored + "\nBalls Played : "+ this.ballsPlayed+
				"\nWickets Taken : "+ this.wickets+ "\nBalls Bowled : "+ this.ballsBowled+ "\nRuns Given : "+ this.runsGiven;

	}
}

