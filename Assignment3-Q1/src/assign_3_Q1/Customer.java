package assign_3_Q1;

public class Customer {
	int accountNumber;
	double pendingBalanceOfMonth;
	double totalOfAllItemsChargedThisMonth;
	double totalCreditAppliedThisMonth;
	double allowedCreditLimit;
	
	public Customer(int accountNumber, double pendingBalanceOfMonth, double totalOfAllItemsChargedThisMonth,
			double totalCreditAppliedThisMonth, double allowedCreditLimit) {
		this.accountNumber = accountNumber;
		this.pendingBalanceOfMonth = pendingBalanceOfMonth;
		this.totalOfAllItemsChargedThisMonth = totalOfAllItemsChargedThisMonth;
		this.totalCreditAppliedThisMonth = totalCreditAppliedThisMonth;
		this.allowedCreditLimit = allowedCreditLimit;
	}
	
	
	public double newBalance() {
		return (this.pendingBalanceOfMonth + this.totalOfAllItemsChargedThisMonth) - this.totalCreditAppliedThisMonth;
	}
	
	public boolean isCreditAllowed() {
		if(this.newBalance()<=this.allowedCreditLimit)
			return true;
		return false;	
	}
	

}
