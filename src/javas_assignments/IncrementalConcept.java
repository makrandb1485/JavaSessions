package javas_assignments;

public class IncrementalConcept {

	public static void main(String[] args) {

		System.out.println("--------------------------------");
		// Assignment 1

		int i = 11;
			i = i++ + ++i;
		System.out.println(i);

		System.out.println("--------------------------------");
		// Assignment 2
		
		int a=11, b=22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		System.out.println("-------------Assignment 3-------------------");
		// Assignment 3
			int j=0;
			j = j++ - --j + ++j - j--;
 			System.out.println(j);
 			
 			System.out.println("-------------Assignment4-------------------");
 			
 			boolean b1 = true;
 			// b1++; //Type mismatch: cannot convert from boolean to int
 			System.out.println(b1);
 			
 			
	}

}
