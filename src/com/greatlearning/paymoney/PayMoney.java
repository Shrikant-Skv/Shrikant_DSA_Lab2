package com.greatlearning.paymoney;

import java.util.Scanner;
public class PayMoney {
	
	public static void main(String[] args) {
		TransactionCheck ob = new TransactionCheck();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of transaction arrray");
		int transSize = sc.nextInt();
		
		int[] transactions = new int[transSize];
		System.out.println("enter the values of array");
		for(int i=0; i<transSize; i++) {
			transactions[i] = sc.nextInt();
		}
		
		System.out.println("enter the total number of targets that needs to be achieved");
		int targetSize = sc.nextInt();
		for(int i=0; i<targetSize; i++) {
			
			System.out.println("\nenter the value of target");
			int target = sc.nextInt();
			int result = ob.getNoOfTransactionsForTarget(transactions, target);
			if(result>0) {
				System.out.println("Target achieved after "+ result+ " transactions");
			}
			else {
				System.out.println("Given Target is not achieved");
			}
		}
		sc.close();
	}
}

