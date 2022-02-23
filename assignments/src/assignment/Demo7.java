package assignment;

class Demo7 {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
        }catch(Exception e)
        {
            System.out.println(e);       
        }
        finally
        {
            System.out.println("finally executed"); // Finally will be executed at last
        }
        
       	    System.out.println("end");
	}
}
