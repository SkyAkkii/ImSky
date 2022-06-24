package UTILITY;

public class StringBufferandBuilder {
	public static void main (String []args) {
		String s=new String ("Akash");
		
		StringBuffer sb = new StringBuffer("Petkar");
		
		StringBuilder sbb = new StringBuilder("PUNE");
		
		s.concat("AKki");
		
		sb.append("Sky");
		
		sbb.append("Maharashtra");
		
		System.out.println(s);// Akash
		System.out.println(sb);
		System.out.println(sbb);
		
		sb.reverse();
		System.out.println(sb);
		
	}

}
