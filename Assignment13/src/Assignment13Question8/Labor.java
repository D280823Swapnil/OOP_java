package Question8;


public class Labor implements Emp
{
    private int hours;
    private double rate;
    
    public Labor(int hours, double rate) {
	super();
	this.hours = hours;
	this.rate = rate;
    }

    public Labor() {
	super();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getSal() {
	return rate*hours;
    }

    @Override
    public double calcIncentives() {
	if(hours>300) return getSal()*(5.0/100);
	return 0.0;
    }

    @Override
    public String toString() {
	return "Labor [hours=" + hours + ", rate=" + rate + "]";
    }
    
    
}
