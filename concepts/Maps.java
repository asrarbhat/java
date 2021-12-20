import java.util.Map;
import java.util.HashMap;
import java.io.PrintStream;
public class Maps{
        public static void main(String[] args){
                Map<String,Integer> map=new HashMap<>();
                PrintStream output=System.out;
		
		map.put("rayon",1);
		map.put("asrar",7);

		int n=map.getOrDefault("rayon",0);//NullPointerException if it returns null and we are assigning it to int
		map.put("rayon",n+1);
                map.put("raiyon",map.getOrDefault("raiyon",0)+1);
		
		int m=map.remove("asrar");

                output.println(map+" "+m+" "+map.size());
		for (Map.Entry entry:map.entrySet()){
			output.println(entry.getKey()+" "+entry.getValue());
		}
		output.println(map.isEmpty()+" "+map.keySet().getClass());;
		output.println(map.values());
		output.println(map.values().toArray()[0]);

		output.println(map.containsKey("rayon"));
		map.forEach((key,value)->{
			output.println(key+"    "+value);
		});

        }
}    
