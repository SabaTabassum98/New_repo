package assignment;

public class Demo6 {
	public static void main (String[] args) {
        try{
               System.out.println(4/0); // Here first we are dividing by zero and it is outer try so, catch of outer try will be executed and the program will get terminated without even entering inner try
               try{
                    int[] a={1,2,3};
                    System.out.println(a[3]);
                }
               catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Out of bounds");
                }
        }
       catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : divide by 0");
        }
	}
    }
