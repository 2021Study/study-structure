import java.util.*;
class Solution08 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < commands.length; i++){
        	int length = commands[i][1]-commands[i][0]+1;
        	System.out.println("i"+i);
        	System.out.println(length);
            for(int j = commands[i][0]-1; j < commands[i][0]-1+length; j++){
            	System.out.println("length"+length);
                temp.add(array[j]);
            }
            Collections.sort(temp);
            System.out.println(temp);
            answer[i]=temp.get(commands[i][2]-1).intValue();
            temp.clear();
        }
        return answer;
    }
}
public class findK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution08 s = new Solution08();
		System.out.println(Arrays.toString(s.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
	}

}
