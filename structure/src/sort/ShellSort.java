package sort;

import java.util.Arrays;

public class ShellSort {
 
    public static void main(String[] args) {
 
        int[] arr = {10, 8, 6, 20, 4, 3, 22, 1, 0, 15, 16};
        int len = arr.length;
 
        int temp = 0;
        int gap = len;
        for (; gap > 1;) {
            gap = (gap / 3)+1;	//2로 나눈 값보다 빠름
            System.out.println("gap : " + gap);
            for (int i = 0; i < gap; i++) {// gap 만큼 반복한다
                //삽입 정렬 로직
                for (int j = i + gap; j < len; j += gap) {
                    /*
                    i : 묶음을 구분하기 위한 값
                    j : 삽입 정렬 종료 인덱스 
                     */
 
                    for (int x = i; x < j; x += gap) {
                        /*
                        x인덱스 ~ j인덱스 까지 반복하여 삽입정렬을 실행한다.
                         */
                        if (arr[x] < arr[j]) break;
                            temp = arr[x];
                            arr[x] = arr[j];
                            arr[j] = temp;
                    }
                }
            }
 
            System.out.println(Arrays.toString(arr));
        }
 
    }
}