//Program to check whether the given input is palindrome or not //

import  java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an input to check it is palindrome or not: ");
        String word = input.nextLine();
        String reverseString = "";
        for (int i = word.length(); i >=0; i--) {
            reverseString += word.charAt(i);
        }
        if(word.equals(reverseString)){
            System.out.println("The given input is a palndrome ");
        }
        else{
            System.out.println("The given input is not a palindrome");
        }
        input.close();
    }
}