package javas_assignments;

public class PrintVowels {
	
	 public static void main(String[] args) {
	       
	        for (char ch = 'a'; ch <= 'z'; ch++) {
	        	
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println(ch);
	            }
	        }
	 
	        System.out.println("Vowels using while loop:");

	        char ch = 'a';

	        while(ch <= 'z') {

	            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

	                System.out.print(ch + " ");

	            }

	            ch++;

	        }
	 
	 
	 }
}
