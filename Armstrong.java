// program to find the given number Armstrong number or not //

// Armstrong numbers (also known as narcissistic numbers or pluperfect numbers)

import java.util.InputMismatchException;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.println("Enter a number to check it is Armstrong or not: ");
            int num = input.nextInt();
            int result = num, sum = 0;
            int n = String.valueOf(num).length();
            for(int i=0;i<n;i++){
                int a = num % 10;
                int ans = (int)Math.pow(a,n);
                num = num/10;
                sum += ans;
            }
            if(sum == result){
                System.out.println("The number "+result+" is Armstrong number");
            }
            else{
                System.out.println("The number "+result+" is not an Armstrong number");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Incorrect type Input! Please Enter the Integer input");
        }
        finally{
            input.close();
        }
    }
}
