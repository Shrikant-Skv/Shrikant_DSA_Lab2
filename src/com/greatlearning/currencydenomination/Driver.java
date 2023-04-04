package com.greatlearning.currencydenomination;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int domSize = sc.nextInt();

		int[] denominations = new int[domSize];

		System.out.println("enter the currency denominations value");
		for (int i = 0; i < domSize; i++) {
			denominations[i] = sc.nextInt();
		}

		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();

		// IntegerSorting sorting = new BubbleSort(); // using BubbleSort

		IntegerSorting sorting = new MergeSort(); // using MergeSort
		NotesCount counting = new NotesCount();

		/*
		 * int[] denominations = { 60, 5, 12, 78, 25 };
		 * counting.calculateNotesCount(denominations, 128);
		 */

		// Sort the denominations in descending order
		sorting.sort(denominations);

		// Print the notes count to pay the amount
		counting.calculateNotesCount(denominations, amount);

		sc.close();
	}

}
