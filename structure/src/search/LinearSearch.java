package search;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==key) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = {2, 51, 23, 43, 8, 43, 12};
		System.out.print("찾을 값 입력: ");
		int key = scan.nextInt();
		System.out.println(key+" is found at index : "+linearSearch(arr, key));
		

	}

}
