package assignment;

import java.util.*;

public class Main {
	public static void main (String[] args) {
		try {
        System.out.println(5/0);
		}catch(Exception e) {
			System.out.println("You tried to divide by zero..");
		}
        System.out.println("End of program!");
	}

}
