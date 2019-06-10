import java.util.ArrayList;

public class Bank {
	//1.variable
	private ArrayList<BankAccount> accounts;
	//2.constructor
	public Bank(){
		accounts = new ArrayList<BankAccount>();
		
	}
	//3.methods
	//add an account to this bank
	public void addAccount(BankAccount a){
		accounts.add(a);
		
	}
	//gets the sum of the balances of all accounts in this bank
	public double getTotalBalance(){
		//put your code here
		double sum = 0; 
       for(BankAccount Balance : accounts) {
    	   
    	   sum = sum + Balance.getBalance();
       }
        return sum;
	}
	//counts the number of bank account whose balance is at least given value.
	public int countBalanceAtLeast(double atLeast){
		//put your code here
        int count =0;
        for(BankAccount AtLeast : accounts)
        {
        	if(AtLeast.getBalance() >= atLeast)
        	{
        		count++;
        	}
        }
        return count;
        
	}
	//finds a bank account with a given number
	public BankAccount find(int accountNumber){
		//put your code here
		for (BankAccount Find : accounts)
		{
			if (Find.getAccountNumber() == accountNumber)
			{
				return Find;
			}
		}
		return null;
        
	}
	//gets the bank account which has minimum balance.
    public BankAccount getMin(){
        //put your code here
    	BankAccount Minimum =accounts.get(0);
    	for(int i=0; i<accounts.size();i++)
    	{
    		BankAccount Min = accounts.get(i);
    		if(Min.getBalance() < Minimum.getBalance())
    		{
    			Minimum = Min;
    		}
    	}
        return Minimum;
    }	
}
