package Question8;


public class Clerk implements Emp
{
    private double salary;

    public Clerk(double salary) {
	super();
	this.salary = salary;
    }

    public Clerk() {
	super();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSal() {
	return salary;
    }

    @Override
    public String toString() {
	return "Clerk [salary=" + salary + "]";
    }    
}
