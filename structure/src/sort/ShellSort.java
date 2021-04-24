package sort;

import java.util.Arrays;

public class ShellSort {
 
    public static void main(String[] args) {
 
        int[] arr = {10, 8, 6, 20, 4, 3, 22, 1, 0, 15, 16};
        int len = arr.length;
 
        int temp = 0;
        int gap = len;
        for (; gap > 1;) {
            gap = (gap / 3)+1;	//2�� ���� ������ ����
            System.out.println("gap : " + gap);
            for (int i = 0; i < gap; i++) {// gap ��ŭ �ݺ��Ѵ�
                //���� ���� ����
                for (int j = i + gap; j < len; j += gap) {
                    /*
                    i : ������ �����ϱ� ���� ��
                    j : ���� ���� ���� �ε��� 
                     */
 
                    for (int x = i; x < j; x += gap) {
                        /*
                        x�ε��� ~ j�ε��� ���� �ݺ��Ͽ� ���������� �����Ѵ�.
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