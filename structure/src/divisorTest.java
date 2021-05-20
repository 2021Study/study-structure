//import java.util.ArrayList;
//import java.util.Arrays;
//
//class Solution06 {
//    public int[] solution(int[] arr, int divisor) {
//        int[] answer;
//        ArrayList<Integer> element = new ArrayList<>();
//        for(int i=0; i<arr.length;i++){
//            if(arr[i]%divisor==0){
//                element.add(arr[i]);
//            }
//        }
//        answer = new int[element.size()];
//        if(element.size()==0) return new int[]{-1};
//        for(int i=0; i < element.size(); i++){
//            answer[i] = element.get(i).intValue();
//        }
//        System.out.println(answer[0]);
//        return answer;
//    }
//}
class Solution06 {
    public String solution(String s) {
//        String answer = "";
//        int mid = s.length()/2;
//        if(s.length()%2==0){
//            answer=s.substring(mid-1, mid+1);
//        }else {
//        answer = s.substring(mid, mid+1);
    	return s.substring((s.length()-1) / 2, s.length()/2 + 1);
        //return answer;
    }
}
public class divisorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution06 s = new Solution06();
		int[] arr = new int[] {1, 2, 3, 36};
		System.out.println(4/2);
		System.out.println(s.solution("qwher"));
	}

}
