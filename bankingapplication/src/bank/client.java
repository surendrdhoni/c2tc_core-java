package bank;

import bank.application.MMCurrentAcc;
import bank.application.MMSavingAcc;
import bank.application.mmbankfactory;
import bank.framework.bankfactoty;
import bank.framework.currentacc;
import bank.framework.savingacc;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankfactoty bf=new mmbankfactory();
		savingacc sv=new MMSavingAcc(288,"surendrdhoni",10000);
		sv.withdraw(12000);
		currentacc ss=new MMCurrentAcc (582,"ganesh",22);
		ss.withdraw(222);
	}

}
