package Question8;


public class Manager implements Emp
{
    private double basiscSalary;
    private double dearanceAllowance;
    
    public Manager(double basiscSalary, double dearanceAllowance) {
	super();
	this.basiscSalary = basiscSalary;
	this.dearanceAllowance = dearanceAllowance;
    }

    public Manager() {
	super();
    }

    public double getBasiscSalary() {
        return basiscSalary;
    }

    public void setBasiscSalary(double basiscSalary) {
        this.basiscSalary = basiscSalary;
    }

    public double getDearanceAllowance() {
        return dearanceAllowance;
    }

    public void setDearanceAllowance(double dearanceAllowance) {
        this.dearanceAllowance = dearanceAllowance;
    }

    @Override
    public double getSal() {
	return basiscSalary+dearanceAllowance;
    }

    @Override
    public double calcIncentives() {
	return basiscSalary*(20.0/100);
    }

    @Override
    public String toString() {
	return "Manager [basiscSalary=" + basiscSalary + ", dearanceAllowance=" + dearanceAllowance + "]";
    }
    
    
}
