// program to print the NEXT CHARACTER for every character in the given input 

import java.util.Scanner;
public class NextChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input String: ");
        String name = input.nextLine();
        String result = "";
        for(int i=0;i<name.length();i++){
            char temp = name.charAt(i);
            temp++;
            result+= temp;
        }
        System.out.println("The next character of the characters given in the input are: "+result);
        input.close();
    }
}
