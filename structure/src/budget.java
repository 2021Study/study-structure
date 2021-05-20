import java.util.Arrays;
class Solution09 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0; int count=0;
        for(int a:d){
        	System.out.println(a);
        	System.out.println(sum);
            sum+=a;
            if(sum>budget){
                return count;
            }
            count++;
            System.out.println(count);
        }
        return d.length;
    }
}
public class budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution09 s= new Solution09();
		int s1 = s.solution(new int[] {2, 2, 3, 3}, 10);
		System.out.println(s1);
	}

}
