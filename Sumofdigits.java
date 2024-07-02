
// SUM OF DIGITS IN A NUMBER //

import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the sum  of digits");
        int num = input.nextInt();
        /*
        To calculate the length of an integer,we must convert it into string and then
        follow the steps as shown below*/
        int value = num;
        //String n = Integer.toString(value);
        String n = String.valueOf(value); // both methods can convert an integer to String.
        int len = n.length();
        int i=0,sum = 0,ans;
        while(i<len){
            ans = num % 10;
            sum += ans;
            num = num / 10;
            i++;
        }
        System.out.println("The sum of all digits in the given number is "+sum);
        input.close();
    }
    
}
