package com.greatlearning.paymoney;

public class TransactionCheck {
	
	//this method will be called for each target check.
		public int getNoOfTransactionsForTarget(int[] transactions, int target) {
			int sum = 0;
			for(int i=0; i<= transactions.length-1; i++) {
				sum = sum+ transactions[i];
				if(sum>= target) {
					return i+1; // Success scenario
				}
			}
			//We do not need additional if condition to check sum< target
			//because if we ctrl is reaching here, then target is not achieved.
			return -1;
		}
}
