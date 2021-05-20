import java.util.*;
class Solution03 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        if(arr.length==1) return new int[] {-1};
        int min_num = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min_num){
                min_num = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=min_num)
            	arr2.add(arr[i]);
        }
        answer = new int[arr2.size()];
        for(int i=0; i<arr2.size(); i++) {
              answer[i] = arr2.get(i);
        }
        return answer;
    }
}
public class test03 {
	public static void main(String[] args) {
		Solution03 s = new Solution03();
		int[] arr = {4, 3, 2, 1};
		System.out.println(s.solution(arr)[2]);
		System.out.println(s.solution(new int[] {10})[0]);
		System.out.println("¾È³ç");
		System.out.println(arr[2]);
	}
}