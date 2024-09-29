package entities;

public class Bank {
	
	private double balance = 0;
	
	public double Add_money(double value) {
		return  balance += value;
	}
	public double Withdraw_money(double value) {
		if(value > balance) {
			System.out.println("You no have money enogh in accont to be withdraw");
		}
		return balance -= value;
	}
	public void View_balance() {
		System.out.printf("Balance: R$ %.2f%n",balance);
	}
}
