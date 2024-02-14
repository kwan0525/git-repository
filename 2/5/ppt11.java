package package1;

import java.util.Scanner;

public class switch문과식2 {

	Int numDays=0;
switch(month) {
   case JAN:case MAR:case MAY: case JUL: case AUG: case OCT:         case DEC:
     numDays=31;
     break;
   case APR:case JUN:case SEP: case NOV:
      numDays=30;
      break;
   case FEB:
      System.out.println(“Enter year  “);
      int year = sc.nextInt();
//    if( (A)    || ( B   &&    C) {
      if( (year % 400 == 0) || (year %% 4 == 0 && !(year % 100 == 0)) ){
         numDays = 29;
      }else {
        numDays = 28;
      }
      break;;
    default:
      System.out.println(“Invalid month: “ +month);
      break;
}

	}


