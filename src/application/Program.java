package application;

import entities.Bank;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Bank bank = new Bank();
		
		bank.Add_money(2000);
		bank.View_balance();
		
		bank.Withdraw_money(1000);
		bank.View_balance();
		
		bank.Withdraw_money(1000);
		
		bank.View_balance();
		
		bank.Withdraw_money(2);
		
		

	}

}
