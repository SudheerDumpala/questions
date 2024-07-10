// Finding Length of a String without using length functions //

import java.util.InputMismatchException;
import java.util.Scanner;
public class FindLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       try{
            System.out.print("Enter a String to find its length: ");
            String word = input.nextLine();
            int count = 0;

            /*char [] array = word.toCharArray();
            for(char ch: array){
                count++;
            }*/

            for (int i = 0; ; i++){
                try {
                    char ch = word.charAt(i);
                    count++;
                    
                } catch (IndexOutOfBoundsException e) {
                    break;
                }
            }
            System.out.println("The Length of the String is "+count);
        }
        catch (InputMismatchException e){
            System.out.println("Incorrect type of input! Enter the String type of input");
        }
        finally{
            input.close();
        }

    }
}

