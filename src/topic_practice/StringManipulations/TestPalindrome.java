package topic_practice.StringManipulations;

public class TestPalindrome {
	
	static String reverse(String st) {
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
	
		String str = "22522";
	
		if(str.length()>2) {
		
		String rev_str = reverse(str);
		
		if(str.equalsIgnoreCase(rev_str)) {
			System.out.println(str + " is a Palindrome");
		}else {
			System.out.println(str + " is Not a Palindrome");
		}
		
	}else {
		System.out.println(str + " is not valid for Palindrome. Enter string with atleast 3 characters ");
	}

	}

}
