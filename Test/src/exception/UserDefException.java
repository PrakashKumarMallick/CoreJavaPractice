package exception;
class InsufficientFundException extends RuntimeException{
	InsufficientFundException(String msg){
		super(msg);
	}
}
class Account{
	private String actNumber;
	private String accHolderName;
	private String actType;
	private int mainBalance;
	private int balance;
	public Account(String actNumber, String accHolderName, String actType, int mainBalance, int balance) {
		super();
		this.actNumber = actNumber;
		this.accHolderName = accHolderName;
		this.actType = actType;
		this.mainBalance = mainBalance;
		this.balance = balance;
	}
	public String getActNumber() {
		return actNumber;
	}
	public void setActNumber(String actNumber) {
		this.actNumber = actNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getActType() {
		return actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
	public int getMainBalance() {
		return mainBalance;
	}
	public void setMainBalance(int mainBalance) {
		this.mainBalance = mainBalance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int deposit(int amt){
		if(amt<=0){
			throw new IllegalArgumentException("Invalid Number");
		}
		this.balance=this.balance+amt;
		return this.balance;
	}
	public int withdraw(int amt)throws InsufficientFundException{
		if(amt<=0){
			throw new IllegalArgumentException("Invalid Number");
		}
		if(amt>this.balance){
			throw new InsufficientFundException("Dont have sufficient fund by "+(amt-this.balance));
		}
		return this.balance=this.balance-amt;
	}
}
public class UserDefException {

	public static void main(String[] args) {
		Account a=new Account("1000","JP","Salary",0,0);
		System.out.println("CUrrent balance: "+a.getBalance());
		try{
		System.out.println("current balance is: "+a.deposit(10000));
		System.out.println("Take ur money and Remaining balance is: "+a.withdraw(2000));
		System.out.println("Take ur money and Remaining balance is: "+a.withdraw(10000));
		}catch(InsufficientFundException e){
			System.out.println(e.getMessage());
		}
	}

}
