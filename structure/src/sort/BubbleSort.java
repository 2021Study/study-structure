package sort;

public class BubbleSort {
	  public static void main(String[] args) {
	  
	    int[] arr = { 17, 8, 20, 11, 5, 12, 15, 7 };
	    int temp;
	  
	    for(int i = 0; i < arr.length; i++) {
	        for(int j = 0 ; j < arr.length - i - 1 ; j++) {
	            if(arr[j] > arr[j+1]) {
	                temp = arr[j+1];
	                arr[j+1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    
	    //결과 확인
	    for(int i:arr) {
	          System.out.print(i+" ");
	    }
	  }
	}