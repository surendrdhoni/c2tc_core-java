package bank.application;

import bank.framework.savingacc;

public class MMSavingAcc extends savingacc {

	public MMSavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		// TODO Auto-generated method stub
		System.out.println("you have withdraw the amount creditlimit"+accBal+"creditlimit exceeded+creditlimit");
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isIssalry()=" + isIssalry() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
