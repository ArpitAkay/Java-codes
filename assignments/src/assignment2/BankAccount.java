package assignment2;

public class BankAccount {
	private long accountno;
	private String ifsc;
	private String bankname;

	// constructor for BankAccount class
	public BankAccount(long accountno, String ifsc, String bankname) {
		this.accountno = accountno;
		this.ifsc = ifsc;
		this.bankname = bankname;
	}

	// getters and setters for accountno, ifsc and bankname;
	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Override
	public String toString() {
		return "BankAccount [accountno=" + accountno + ", ifsc=" + ifsc + ", bankname=" + bankname + "]";
	}
}
