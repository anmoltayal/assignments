import java.util.*;
class Comparesets {
	public static void main(String args[]) {
		Set<String> s=new HashSet<String>();
		s.add("MONDAY");
		s.add("TUESDAY");
		s.add("WEDNESDAY");
		s.add("THRUSDAY");
		Set<String> st=new HashSet<String>();
		st.add("MONDAY");
		st.add("TUESDAY");
		st.add("FRIDAY");
		s.retainAll(st);
		System.out.println("Common Elements are : "+s);
	}
}