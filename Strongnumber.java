// TO check the given number is Strong number or not //

/* Strong number: A number is said to be Strong number if all the sum of the 
    Factorial of the digits in the number is equals to the number itself */
 
import java.util.InputMismatchException;
import java.util.Scanner;
class Factorialnumber{
    public  int calculateFactorial(int fact){
        if(fact == 0 || fact == 1){
            return 1;
        }else{
            return fact * calculateFactorial(fact-1);
        }
    }
}
public class Strongnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a non-negative number to check it is Strong number or not: ");
            int number = input.nextInt();
            //int length = String.valueOf(number).length();
            int sum = 0,originalNum = number;
            Factorialnumber obj = new Factorialnumber();
            while(number > 0){
                int answer = number % 10;
                sum += obj.calculateFactorial(answer);
                number = number / 10;
            }
            if(sum == originalNum){
                System.out.println("The given number "+originalNum+" is a Strong Number ");
            }
            else{
                System.out.println("The given number "+originalNum+" is not a Strong Number");
            }
        } 
        catch (InputMismatchException e) {
            System.out.println("Incorrect input!! Please Enter a non-negative Integer input. ");
        }
        finally{
            input.close();
        }
    }
    
}
