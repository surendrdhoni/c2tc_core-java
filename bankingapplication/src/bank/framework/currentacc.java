package bank.framework;

public class  currentacc extends bankacc {
	
private 	float creditLimit=100000;
public currentacc (int accNo, String accNm, float accBal) {
	super(accNo,accNm,accBal);
}
public float getCreditLimit() {
	return creditLimit;
}

public void setCreditLimit(float creditLimit) {
	this.creditLimit = creditLimit;
}

}
