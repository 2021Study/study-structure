 import java.util.HashMap;
 public class Map{
	 public static void main(String args[]){
		 HashMap<String, String> map = new HashMap<>();
		 map.put("����", "���ѹα�");
		 map.put("����", "18��");
		 for(int i = 0; i<map.size(); i++){
			 System.out.print(map.get("����"));
		 }
	 }
 }