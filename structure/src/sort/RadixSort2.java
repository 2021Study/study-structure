package sort;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
 
public class RadixSort2 {
 
    public static void main(String[] args) throws IOException {
 
        // 1. 변수 선언
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

        // 정렬 전
        for (Integer i : pQue) {
            sb1.append((int) i + " ");
        }
        System.out.println("정렬 전: ");
        System.out.println(sb1);

        pArr = new int[pQue.size()];
        
        for(int i=0; i<pArr.length; i++) {
            pArr[i] = pQue.poll();	// queue의 첫번째 값을 반환하고 제거 비어있다면 null
        }
        
        // radixSort 돌림
        pArr = radixSort(pArr);
 
        StringBuilder sb2 = new StringBuilder();
        
        
        // 정렬
        for (Integer i : pArr) {
            sb2.append((int) i + " ");
        }

        System.out.println("정렬 후: ");
        System.out.println(sb2);
    }
 
    static int[] radixSort(int[] arr) {
        
        int sortArr[] = new int[arr.length];
        int queSize, max_length = 0;
        int length = 0;
        int idx= 0;
        
        Map<Integer, Queue> map = new HashMap<>();
        
        for (int l : arr) {
        	length = (int) Math.log10(Math.abs(l))+1;	//자리수 구하는 식
            if(max_length < length) {	//가장 길이가 긴 자리 수
                max_length = length;
            }
        }
        
        // map 초기 세팅
        for (int j = 0; j < 10; j++) {
            map.put(j, new LinkedList<Integer>());
        }
 
        // 최대 자리수 만큼 반복
        for (int i = 0; i < max_length; i++) {
 
            // map 초기화
            for (int j = 0; j < 10; j++) {
                map.get(j).clear();
            }
            for (int j = arr.length - 1; j >= 0; j--) { // 배열의 뒤부터 Hash Map에 인덱싱해서 담음 배열만큼 반복
                map.get((int) (Math.abs(arr[j]) / Math.pow(10, i) % 10)).add(arr[j]);
            }
 
            // 9부터 Map에서 꺼내 sortArr에 담음
            idx = arr.length - 1;
            for (int j = 9; j >= 0; j--) {
 
                queSize = map.get(j).size();
                for (int qIdx = 0; qIdx < queSize; qIdx++) {
                    sortArr[idx] = (Integer) map.get(j).poll();
                    idx--;
                }
            }
 
            // 5. arr에 sortArr 복사
            System.arraycopy(sortArr, 0, arr, 0, arr.length);
        }
        return arr;
    }
}