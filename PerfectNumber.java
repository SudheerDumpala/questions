/* A number is said to be a perfect number if the addition of all the divisors
 of the number except itself is equls to the number itself*/ 

 // Example : 1) 28: 1+2+4+7+14=28
 // 2) 496: 1+2+4+8+16+31+62+124+248=496

import java.util.InputMismatchException;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    try{
        System.out.println("Enter a non-negtive number to check it is perfect or not: ");
        int number = input.nextInt();
        int sum = 0;
        for(int i = 1;i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            System.out.println("The given number "+ number+" is the perfect number");
        }
        else{
            System.out.println("The given number "+ number+" is not the perfect number");
        }    
    }
    catch(InputMismatchException e){
        System.out.println("Incorrect type of input! Please Enter Integer input ");
    }
    finally{
        input.close();
    }
    }
}
