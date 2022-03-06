package bank.application;

import bank.framework.bankfactoty;
import bank.framework.currentacc;
import bank.framework.savingacc;

public class mmbankfactory implements bankfactoty {


	@Override
	public savingacc getNewsavingaccount(int accNo, String accNm, float accBal) {
		savingacc sd =new savingacc(accNo,accNm,accBal);
		
		return sd;
	}

	@Override
	public currentacc getNewcurrentaccount(int accNo, String accNm, float accBal) {
		currentacc ss =new currentacc(accNo,accNm,accBal);
	
		return ss;
	}

	

}
