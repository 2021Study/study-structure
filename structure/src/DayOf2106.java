class Solution07 {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"FRI", "SAY", "SUN", "MON", "TUE", "WED", "THU"};
        int sum=b;
        for(int i=0; i<a-1; i++){
            sum+=month[i];
        }
        answer = day[(sum%7)];
        
        return answer;
    }
}
public class DayOf2106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution07 s = new Solution07();
		System.out.println(s.solution(1, 5));
	}

}
