/* PRIME NUMBER PROGRAM IN JAVA */

import java.util.Scanner;
public class primenumber {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        
        // PRINTS WHETHER IS THE GIVEN NUMBER IS PRIME OR NOT //
        
        int count = 0;
        for(int i=1;i<num;i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 1){
            System.out.println("The Number "+num +" is prime number");
        }
        else{
            System.out.println("The number "+num+" is not a prime number");
        }

        // PRINTS ALL THE PRIME NUMBERS BETWEEN TWO NUMBERS //

        System.out.println("Enter the upper limit of the number: ");
        int lwrlmt = input.nextInt();
        System.out.println("Enter the lower limit of the number: ");
        int uplmt = input.nextInt();
        for(int j = lwrlmt;j <=uplmt;j++){
            boolean isprime = true;
            for(int k=2;k<j;k++){
                if(j % k == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(j+ " ");
            }
        }
    }
}
