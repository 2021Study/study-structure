class Solution02 {
    public int solution(int num) {
        int answer = 0;
        while(true){
            if(num%2==0){
                num/=2;
                answer+=1;
            }else{
                num=num*3+1;
                answer+=1;
            }
            if (num==1) break;
        }
        return answer;
    }
}
public class CollatzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution02 s = new Solution02();
		System.out.println(0);
		System.out.println(s.solution(626331));
		System.out.println(1);
		
	}

}
