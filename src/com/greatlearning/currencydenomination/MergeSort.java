package com.greatlearning.currencydenomination;

public class MergeSort implements IntegerSorting {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		sort(arr, 0, arr.length - 1);
	}

	private void sort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			// recursively calling sort until completely broken down
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private void merge(int[] arr, int left, int mid, int right) {
		// calculate the size of left and right sub array

		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create left and right temp array
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];

		// copy the actual array elements into left and right array

		for (int i = 0; i < n1; i++) {
			leftArr[i] = arr[left + i];
		}

		for (int j = 0; j < n2; j++) {
			rightArr[j] = arr[mid + j + 1];
		}

		int i = 0, j = 0, k = left;
		// Sorting left and right array and store i n actual array
		while (i < n1 && j < n2) {
			if (leftArr[i] >= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		// Add left out left Array
		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		// Add left out right Array
		while (i < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}

	}
}
