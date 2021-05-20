class Solution05 {
    public boolean solution(String s) {
        boolean answer = true;
        System.out.println(s.length());
        if(s.length()!=4 && s.length()!=6) {
        	System.out.println("dpf");
        	return false;
        }
        
        return answer;
    }
}
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution05 s = new Solution05();
		System.out.print(s.solution("a234"));
	}

}
