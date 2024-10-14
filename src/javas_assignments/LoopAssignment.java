package javas_assignments;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LoopAssignment {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			System.out.println("I am Batman");
		}
		
		System.out.println("--------------------------");
		
		for(int i=1; i<=9; i++) {
			System.out.println("I am Batman " +i);
		}
		
		
		
		//3. WAP to print 10 to 1 using for, while and do-while loop
		System.out.println("---------For----------------");
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("---------WHILE ----------------");
		int i = 10;
		while(i >=1) {
			
			System.out.println(i);
			i--;
		}
		
		System.out.println("----------DO - WHILE---------------");
		int j = 10;
		do {
			System.out.println(j);
			j--;
		}while(j>=1);
		
		//4. Write a program in Java to print "Hello World" ten times using while loop
		
		System.out.println("---------WHILE ----------------");
		int p = 1;
		while(p <=10) {
			
			System.out.println("Hello World");
			p++;
		}
		
		//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		
		for(int k=1; k<=100; k++) {
			
			int num=5;
			System.out.println(num * k);
		}
		
		System.out.println("----------DO - WHILE---------------");
		int l = 1;
		do {
			int num = 5;
			System.out.println(num * l);
			l++;
		}while(l<=100);
		

		System.out.println("----------WHILE---------------");
		int m = 1;
		while(m<=100) {
			int num = 5;
			System.out.println(num * m);
			m++;
		}
		
		//Print all odd and even numbers between 1 to 100
		
		System.out.println("OddNumber: ");
		for(int o=1; o <=100; o++) {
			
		    if(o%2!=0) {
		    	System.out.println(o);
		    }
		}
		System.out.println("EvenNumber: ");
		    for(int q =1; q <=100; q++) {
				
			    if(q%2==0) {
			    	System.out.println(q);
			 }
		}
		    
	//	    infinite loop
//		    int a = 1;
//		    while(a<=1){
//		    System.out.println("Hi Java");
//		    }
		    
		//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.    

		    for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.println(ch + " = " + (byte) ch);
			}	
		    
//		    char ch = 'a';
//		    while(ch <= 'z') {
//		    	System.out.println(ch + " = " + (byte) ch);
//		    	ch++;
//		    }
		    
		    for (char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.println(ch + " = " + (byte) ch);
			}
		    
		    for (char ch = '0'; ch <= '9'; ch++) {
				System.out.println(ch + " = " + (byte) ch);
			}
		    
		    //Reverse Alphabet Series: Develop a Java program to print the series of lowercase alphabets in reverse order from 'z' to 'a'.
		    for (char ch = 'z'; ch >= 'a'; ch--) {
				System.out.print(ch);
			}
		    
		    //Floating Point Series: Write a Java program to print the series of floating-point numbers from 1.0 to 10.0.
		    System.out.println("----------1.0 to 10.0----------------");
		    
		    for(float a = 1.0f; a<=10.0; a++ ) {
		    	System.out.println(a);
		    }
		    
		    // Multiples of 9 Series: Develop a Java program to print the series of numbers where each number is a multiple of 9, starting from 0 and ending at 99.
		    
		    System.out.println("each number is a multiple of 9");
		    for(int b=0; b<=99; b++) {
		    	if(b%9 ==0) {
		    		System.out.println(b);
		    	}
		    }
		    
	}
	
}
