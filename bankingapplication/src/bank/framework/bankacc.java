package bank.framework;

public class  bankacc {
private int  accNo;
private String accNm;
private float accBal;

public bankacc(int accNo, String accNm, float accBal) {
	this.accNo = accNo;
	this.accNm = accNm;
	this.accBal = accBal;
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccNm() {
	return accNm;
}
public void setAccNm(String accNm) {
	this.accNm = accNm;
}
public float getAccBal() {
	return accBal;
}
public void setAccBal(float accBal) {
	this.accBal = accBal;
}
public void withdraw(float accBal)
{
System.out.println("the account balance of withdraw is"+accBal);
}
public void deposite(float accBal)
{
System.out.println("the deposite of accBal is"+accBal);
}
@Override
public String toString() {
	return "bankacc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
}
}