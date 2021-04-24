package sort;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
 
public class RadixSort2 {
 
    public static void main(String[] args) throws IOException {
 
        // 1. ���� ����
        Queue<Integer> pQue = new LinkedList();
        int pArr[] = null; 
        
        pQue.add(65);
        pQue.add(54);
        pQue.add(22);
        pQue.add(125);
        pQue.add(83);
        pQue.add(9);
        pQue.add(70);
        pQue.add(56);
        
        StringBuilder sb1 = new StringBuilder();

        // ���� ��
        for (Integer i : pQue) {
            sb1.append((int) i + " ");
        }
        System.out.println("���� ��: ");
        System.out.println(sb1);

        pArr = new int[pQue.size()];
        
        for(int i=0; i<pArr.length; i++) {
            pArr[i] = pQue.poll();	// queue�� ù��° ���� ��ȯ�ϰ� ���� ����ִٸ� null
        }
        
        // radixSort ����
        pArr = radixSort(pArr);
 
        StringBuilder sb2 = new StringBuilder();
        
        
        // ����
        for (Integer i : pArr) {
            sb2.append((int) i + " ");
        }

        System.out.println("���� ��: ");
        System.out.println(sb2);
    }
 
    static int[] radixSort(int[] arr) {
        
        int sortArr[] = new int[arr.length];
        int queSize, max_length = 0;
        int length = 0;
        int idx= 0;
        
        Map<Integer, Queue> map = new HashMap<>();
        
        for (int l : arr) {
        	length = (int) Math.log10(Math.abs(l))+1;	//�ڸ��� ���ϴ� ��
            if(max_length < length) {	//���� ���̰� �� �ڸ� ��
                max_length = length;
            }
        }
        
        // map �ʱ� ����
        for (int j = 0; j < 10; j++) {
            map.put(j, new LinkedList<Integer>());
        }
 
        // �ִ� �ڸ��� ��ŭ �ݺ�
        for (int i = 0; i < max_length; i++) {
 
            // map �ʱ�ȭ
            for (int j = 0; j < 10; j++) {
                map.get(j).clear();
            }
            for (int j = arr.length - 1; j >= 0; j--) { // �迭�� �ں��� Hash Map�� �ε����ؼ� ���� �迭��ŭ �ݺ�
                map.get((int) (Math.abs(arr[j]) / Math.pow(10, i) % 10)).add(arr[j]);
            }
 
            // 9���� Map���� ���� sortArr�� ����
            idx = arr.length - 1;
            for (int j = 9; j >= 0; j--) {
 
                queSize = map.get(j).size();
                for (int qIdx = 0; qIdx < queSize; qIdx++) {
                    sortArr[idx] = (Integer) map.get(j).poll();
                    idx--;
                }
            }
 
            // 5. arr�� sortArr ����
            System.arraycopy(sortArr, 0, arr, 0, arr.length);
        }
        return arr;
    }
}