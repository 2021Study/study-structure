class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = String.valueOf(x);
        int sum = 0;
        int d = x;
        while(x!=0) {
        	sum += x/10;
        	x%=10;
        	System.out.println(x);
        }
//        for(int i=0; i<s.length(); i++){
//            sum += x/10;
//            x %= 10;
//        }
//        sum+=x;
        System.out.println(d);
        System.out.println(sum);
        answer = (d%sum==0?true:false);
        return answer;
    }
}
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s1= new Solution();
		System.out.println(s1.solution(12));
		
	}

}
