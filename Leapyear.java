// Leap year program in java //

import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter the year to Find it is leap year or not: ");
        Scanner input = new Scanner(System.in);
        int year  = input.nextInt();
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
                System.out.println("The year "+year+" is a leap year");
        }
        else{
            System.out.println("The given year "+year+" is not a leap year");
        }
    }
}
