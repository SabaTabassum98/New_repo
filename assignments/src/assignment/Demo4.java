package assignment;

import java.util.Scanner;

class Demo4 {
	public static void main (String[] args) {
        try{
        	try (Scanner scan = new Scanner(System.in)) {
				int a = 1;
				int b = Integer.parseInt(scan.next());
				System.out.println(a/b);
			}
        }catch(ArithmeticException e)
        {
        	System.out.println("ArithmeticException :divide by 0");
        }
        catch(Exception e)
        {	
        	// This exception will show up for other exceptions
            System.out.println("Exception : divide by 0");
	}
	}
}
/*
this program will not work as catch block ArithmeticException should be before Exception or else it will throw unreachable compile time error
class Main {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
        }catch(Exception e)
        {
            System.out.println("Exception : divide by 0");
        }catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException :divide by 0");
        }
	}
}
*/