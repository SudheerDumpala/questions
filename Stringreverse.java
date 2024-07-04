/* To Find whether The given number is palindrome or Not */

import java.util.InputMismatchException;
import java.util.Scanner;
public class Stringreverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter an input to reverse it: ");
            String word = input.nextLine();
            int n = word.length();
            char ch[] = new char[n];
            for(int i=0;i<n;i++){
                ch[i] = word.charAt(n-1-i);
            }
            System.out.print("The reversed input is: ");
            for(char c:ch){
                System.out.print(c);
            }
            System.out.println("");
        }
        catch(InputMismatchException e){
            System.out.println("You haven't give the correct type of input");
        }
        finally{
            input.close();
        }
    }
}
