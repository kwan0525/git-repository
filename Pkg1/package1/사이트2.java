package package1;

import java.util.Scanner;

public class 사이트2 {

	public static void main(String[] args) {
           
		Scanner scanner = new Scanner(System.in);
		char ch;

		while (true) {
            System.out.print("Enter a key: ");
            ch = scanner.nextLine().charAt(0);

		
		        switch (ch)
		        {
		            case 'L':
		            case 'l':
		            	System.out.println("Go Left\n");
		                break;
		            case 'R':
		            case 'r':
		            	System.out.println("Go Right\n");
		                break;
		            case 'Q':
		            case 'q':
		            	System.out.println("End...\n");
		                return ;
		             default:
		            	 System.out.println("Error.\n");
		                break;
		        }
		    
		}
	}
}