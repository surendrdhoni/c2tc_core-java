package bank.framework;

public class  savingacc extends bankacc {
	public savingacc (int accNo, String accNm, float accBal) {
		super(accNo,accNm,accBal);
	}
	private static  boolean issalry=true;

	public boolean isIssalry() {
		return issalry;
	}

	public void setIssalry(boolean issalry) {
		this.issalry = issalry;
	}

	@Override
	public String toString() {
		return "savingacc [issalry=" + issalry + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
