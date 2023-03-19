package chinmaya123.chinmaya123;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {

		HashMap hm = new HashMap ();
		
		hm.put(101,"chinmaya");
		hm.put(102,"linku");
		hm.put(103,"jamuna");
		hm.put(104,"Laxmi");
		
		System.out.println(hm);
		
		for(Map.Entry m : hm.entryset());
		{
		System.out.println(m.getkey()+" "+m.getvalue());
		
	}
		hm.remove(103);
		System.out.println(hm);
		
		for(Map.Entry m: hm.entryset())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

}
