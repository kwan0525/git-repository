package package1;

public class 프로젝트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String role = "Security";
           
           int time = 9;
           int safetyRating = 5;
           int safetyTheshold = 3;
           
          switch(role)
          {
          case  "Security":
             if(safetyRating >=safetyTheshold )
        	   System.out.println("안전등급");
             else 
        	   System.out.println("불안전");
             break;
             default:
            	 System.out.println("지금은 급식시간입니다!");
            	 break;
          }
           
           
           
	}

}
