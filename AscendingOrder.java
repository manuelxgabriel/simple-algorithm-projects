/*
 Write an algorithm in the first comment of the program below
to perform the following task: Output “Ascending Order” if the 
values in a list of integers entered by the user are in ascending
order (smallest to largest.), otherwise output “Not in ascending 
order.” Do not assume the size of the list. (ie Do not ask the user 
how many numbers are in the list.) The use will enter 0 when they 
have entered their list.
 */

/* pseudo codes here:

get userNumber
while (userNumber != 0)
   if (userNumber > maxNumber)
   maxNumber = userNumber
   
   else 
   userNumber < smallestNumber
   smallestNumber = userNumber
   
   if (smallestNumber == 0 )
   print smallest number
   print maxNumber
   
*/

import java.util.Scanner;


public class AcendingOrder {
    final static int STOP = 0;
   
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      
      int maxNumber;
      int smallestNumber = 0;
      int userNumber;
      
      System.out.print("Enter an integer: ");
      userNumber = userInput.nextInt();
      maxNumber = userNumber;
      
      while (userNumber != 0) {
         System.out.print("Enter an integer: ");
         userNumber = userInput.nextInt();
         if (userNumber > maxNumber) {
            maxNumber = userNumber;
            }
         else {
            smallestNumber = userNumber;
            userNumber = STOP;
            }
         }
         
         if (smallestNumber == 0 ){
            System.out.println("The integers were in ascending order.");
         }
         else {
            System.out.println("The integers were not in ascending order.");
            }

    }
}
