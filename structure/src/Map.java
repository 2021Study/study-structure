 import java.util.HashMap;
 public class Map{
	 public static void main(String args[]){
		 HashMap<String, String> map = new HashMap<>();
		 map.put("나라", "대한민국");
		 map.put("나이", "18세");
		 for(int i = 0; i<map.size(); i++){
			 System.out.print(map.get("나라"));
		 }
	 }
 }