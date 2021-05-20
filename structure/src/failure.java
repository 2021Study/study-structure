import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
class Solution10 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] budget = new int[N];
        int[] budget2 = new int[N];
        double[] budget3 = new double[N];
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        double min =1.0;
        int j = 0;
        for(int stage:stages){
            if(stage>N)
                stage = N;
            else
                budget2[stage-1]+=1;
            for(int i=0; i<stage; i++){
                budget[i]+=1;
            }
            
        }
		for(int i=0; i<N; i++){
		    budget3[i] = (double)budget2[i]/budget[i];
		}
		for(int i=1; i<=N; i++) {
			map.put(i, budget3[i-1]);
			if(map.get(i)==null){
                map.put(i, 0.0);
            }
		}
		for(Integer key : map.keySet()) {
			System.out.println("key : " + key + " / " + "value : " + map.get(key));
		}

        List<Integer> listKeySet = new ArrayList<>(map.keySet());

		Collections.sort(listKeySet, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));        System.out.print(Arrays.toString(budget2));
        System.out.print(Arrays.toString(budget));
        System.out.print(Arrays.toString(budget3));
        for(Integer key: listKeySet) {
        	answer[j++] = key;
        	System.out.println("key: "+key);
        }
        return answer;
    }
}
public class failure {
	public static void main(String args[]) {
		Solution10 s = new Solution10();
		System.out.println(Arrays.toString(s.solution(5,new int[]{2,1,2,4,2,4,3,3})));
	}

}
