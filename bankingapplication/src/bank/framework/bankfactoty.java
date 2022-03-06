package bank.framework;

public interface bankfactoty {
	public savingacc getNewSavingAccount(int accNo, String accNm, float accBal);
	public currentacc getNewCurrentAccount();
}
