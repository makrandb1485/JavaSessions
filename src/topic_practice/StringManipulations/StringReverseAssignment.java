package topic_practice.StringManipulations;

public class StringReverseAssignment {
	
public static String reverse(String st) {
		
		//null check
		if(st == null) {
			throw new RuntimeException("VALUE CAN NOT BE NULL");
		}
		
		//length == 1 or 0
		if (st.length() == 1 || st.length() == 0) {
			return st;
		}

		int len = st.length();//8

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);// muineles
		}

		return rev.trim();

	}

	public static void main(String[] args) {

		String str = "Java Python Ruby";
		System.out.println(str);
		System.out.println("------------------");
		reverse(str);
		
		System.out.println("------------------");
		
		String str_split[] = str.split(" ");
		for(int i=0; i < str_split.length; i++) {
			System.out.print(reverse(str_split[i]) + " ");
		}
		
	}

}
