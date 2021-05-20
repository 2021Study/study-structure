class Solution04 {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0)=='-'){
            answer = -1*Integer.parseInt(s.substring(1));
        }else{   
            int num = Integer.parseInt(s);
            answer = num;
        }
        return answer;
    }
}
public class SearchKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution04 s = new Solution04();
		System.out.println(s.solution("-1234"));

	}

}
