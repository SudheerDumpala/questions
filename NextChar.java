// program to print the NEXT CHARACTER for every character in the given input 

import java.util.Scanner;
public class NextChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input String: ");
        String name = input.nextLine();
        String result = "";
        for(int i=0;i<name.length();i++){
            char currentChar = name.charAt(i);
            char nextChar = getNextChar(currentChar);
            result += nextChar;
        }
        System.out.println("The next character of the characters given in the input are: "+result);
        input.close();
    }
        
        private static char getNextChar(char ch){
            if(ch == 'Z'){
                return 'A';
            }
            else if(ch == 'z'){
                return 'a';
            }
            else if(Character.isLetter(ch)){
                return (char) (ch+1);
            }
            else{
                return ch;
            }
        }
}
