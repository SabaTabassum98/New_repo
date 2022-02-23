package assignment;

public class Demo5 {
	public static void main (String[] args) {
        try{
                try{
                    int[] a={1,2,3};
                    System.out.println(a[3]); // We will get ArrayIndexOutOfBoundsException here and catch block of this try will be executed and control will be transferred to the outer try
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Out of bounds");
                }
                	System.out.println(4/0); // Control will come here from the inner try and from here it will go to the outer catch and program terminates
        	}
        catch(ArithmeticException e)
		  {
		     System.out.println("ArithmeticException : divide by 0");
		  }
	}
    }
