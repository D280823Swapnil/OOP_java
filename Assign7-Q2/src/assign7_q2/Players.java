package assign7_q2;


public class Players {
	
	public static int countOfBatters(Cricketer [] cricketer) {
		
		int count=0;
		for(int i=0; i<11; i++) {
			if(cricketer[i].getBallsPlayed()>0) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int countOfBowlers(Cricketer [] cricketer) {
		
		int count=0;
		for(int i=0; i<11; i++) {
			if (cricketer[i].getBallsBowled()>0){
				count++;
			}
		}
		
		return count;
	}
	
	public static int batterTotalRuns(Cricketer [] cricketer) {
			
	
			int runs=0;
			
			for(int i=0; i<11; i++) {
				if(cricketer[i].getBallsPlayed()>0) {
					runs += cricketer[i].getRuns();
				}
			}
			
			return runs;
		}
	
	public static int bowlerTotalWickets(Cricketer [] cricketer) {
		
		int wickets=0;
		
		for(int i=0; i<11; i++) {
			if(cricketer[i].getBallsBowled()>0) {
				wickets += cricketer[i].getWickets();
			}
		}
		
		return wickets;
	}
	
	public static Cricketer maxiRunsBatter(Cricketer [] cricketer) {
		
		int runs=0;
		Cricketer c=null;
		
		for(int i=0; i<11; i++) {
			if(cricketer[i].getBallsPlayed()>0) {
				if(runs<cricketer[i].getRuns()) {
					runs = cricketer[i].getRuns();
					c = cricketer[i];
				}
			}
		}
		
		return c;
	}
	
	public static Cricketer maxiWicketsBowler(Cricketer [] cricketer) {
			
			int wickets=0;
			Cricketer c=null;
			
			for(int i=0; i<11; i++) {
				if(cricketer[i].getBallsBowled()>0) {
					if(wickets<cricketer[i].getWickets()) {
						wickets = cricketer[i].getWickets();
						c = cricketer[i];
					}
				}
			}
			
			return c;
		}
	
	
	
	
}
