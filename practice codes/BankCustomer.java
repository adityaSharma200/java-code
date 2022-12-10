package pack4;

public class BankCustomer {
	public int acno;
	String name;
	int amt;
	public BankCustomer(int acno, String name, int amt) {
		super();
		this.acno = acno;
		this.name = name;
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "BankCustomer [acno=" + acno + ", name=" + name + ", amt=" + amt + "]";
	}
     
	
	

}
