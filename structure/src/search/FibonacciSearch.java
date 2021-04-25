package search;

import java.util.Scanner;

public class FibonacciSearch {
	
	public static int fiboSearch(int a[], int n, long s_value) {
		int index = 0;
		int pos = 0;
		int k = 0;
		int fibo[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,
				377,610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368,
				75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309,
				3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986,
				102334155, 165589141, 267914296, 433494437, 701408733, 1134903170,
				1836311903, Integer.MAX_VALUE};
		
		while(fibo[k] < n) k++;
		
		while(k > 0) {
			pos = index + fibo[--k];
			if(pos >= n || s_value < a[pos]);
			else if(s_value > a[pos]) {
				index = pos;
				k--;
			}
			else {return pos;}
		}
		return -1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9, 12, 14, 17, 19, 23, 50, 54, 67, 72, 76};
		int n, i, pos, search_data;
		
		n = a.length;
		for(i = 0; i< n; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("");
		System.out.print("찾고자 하는 값 입력: ");
		
		Scanner scan = new Scanner(System.in);
		search_data = scan.nextInt();
		pos = fiboSearch(a, n, search_data);
		
		if(pos >= 0) {
			System.out.println("found " + search_data + " at " + pos );
		}else {
			System.out.println("not found");
		}
	
		
	}

}