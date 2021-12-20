import java.util.List;
import java.util.Collections;//it is a class
import java.util.ArrayList;

public class Lists{
	public static void main(String[] args){
		List<Integer> list=new ArrayList<>();

		list.add(3);
		list.add(4);
		list.add(0,44);
		list.set(1,22);
		list.add(1,23);

		System.out.println(list.subList(1,4));
		Collections.sort(list);
		Collections.addAll(list,1,1,2,3);
		Collections.reverse(list);
		System.out.println(list);

		list.remove(list.size()-1);
		list.remove(0);
		list.remove(new Integer(22));

		System.out.println(list);
		System.out.println(list.contains(273));
		System.out.println(list.indexOf(23));
	}
}
