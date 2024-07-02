// To Find Whether the given number is Even or Odd

import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to  find whether it is even or odd");
        int num = input.nextInt();
        String result = (num % 2 == 0)? "The given number is Even number": "The given number is Odd number";
        System.out.println(result);
        input.close();
    }
}
