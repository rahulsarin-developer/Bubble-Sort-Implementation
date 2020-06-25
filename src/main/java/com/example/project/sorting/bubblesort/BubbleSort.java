package com.example.project.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {8, 4, 12, 5, 45, 20, 6};
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}
}
