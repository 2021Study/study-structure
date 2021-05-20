import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
class Solution12 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        HashMap<Character, String> budget = new HashMap<>();
        for(String str:strings){
            budget.put(str.charAt(n), str);
            System.out.println(str.charAt(n));
        }
        TreeMap<Character,String> tm = new TreeMap<Character,String>(budget);
        Iterator<Character> iteratorKey = tm.keySet( ).iterator( ); 
        //Object[] mapKey = budget.keySet().toArray();
        int i=0;
        for(Character k : tm.keySet()){ //저장된 key값 확인
            System.out.println("[Key]:" + k + " [Value]:" + budget.get(k));
        }
        for(Character nkey: tm.keySet()){
            answer[i++] = tm.get(nkey);
        }
        
        return answer;
    }
}
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution12 s = new Solution12();
		System.out.println(Arrays.toString(s.solution(new String[] {"abce", "abcd", "cdx"}, 2)));
	}

}
