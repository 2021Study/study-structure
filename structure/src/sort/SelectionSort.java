package sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[] {2,13,6,13,2,5,6};
		new SelectionSort(arr);
	}
	
	public SelectionSort(int[] arr) {
		int indexMin; // 값을 교체할 위치
		int temp;
		for (int i = 0; i < arr.length-1; i++) { // 1.
			indexMin = i;
			for (int j = i + 1; j < arr.length; j++) { // 2.
				if (arr[j] < arr[indexMin]) {
				// if (arr[j] > arr[indexMin]) { // 내림차순
					indexMin = j;
				}
			}
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}