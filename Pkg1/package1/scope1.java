package package1;

public class scope1 {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 int x = 1;
		// int y = 2;
         x++;

         { // start of block
              int y = 2;
              y++;
              x++;
         } // end of block
         x++;
         //y++; //out of scope
    }
}
