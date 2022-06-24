package TEST;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class Coll {
	public static void main(String []args) {
//		ArrayList ar = new ArrayList();
//		ar.add("akki");
//		ar.add(6);
//		ar.add('c');
//		
//		for (int i=0; i<ar.size();i++);
//		{
//			System.out.println(ar.get(i));
//		}
//		
//		LinkedList li = new LinkedList();
//		li.add("velocity");
//		li.add(7);
//		li.add(null);
//		li.add(null);
//		
//		for (int i=0; i< li.size();i++);
//		{
//			System.out.println(li.get(i));
//		}
//		
//		Vector v = new Vector ();
//		v.add("velocity");
//		v.add(null);
//		v.add(null);
//		v.add(8);
//		for (int i = 0;i<v.size();i++);
//		{
//			System.out.println(v.get(i));
//		}
//		
//		PriorityQueue<String> pq = new PriorityQueue<String>();
//		pq.add("Akash");
//		pq.add("Petkar");
//		
		//peak method is used to get the peak data 
		//poll method is used to get poll data
//		
//		System.out.println(pq);
//		
//		HashSet hs = new HashSet();
//		hs.add("velocity");
//		hs.add(4);
//		hs.add(4);
//		hs.add(null);
//		hs.add(null);
//		
//		Iterator it = hs.iterator();
//		
//		while (it.hasNext())
//		{
//		 System.out.println(it.next());
//		}
//		
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		hm.put(1, "Velocity");
//		hm.put(2, "Katraj");
//		hm.put(1, "pune");
//		hm.put(null, null);
//		hm.put(4, null);
//		
//		System.out.println(hm.get(2));
//		System.out.println(hm.get(1));
//		System.out.println(hm.get(null));
//		System.out.println(hm.get(4));
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("one", 9);
		ht.put("two", 7);
		ht.put(null, null);
		ht.put("three", 8);
		
		System.out.println(ht.get("one"));
		System.out.println(ht.get("two"));
		System.out.println(ht.get("three"));
		
			
		
	}

}
