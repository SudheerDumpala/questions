// FIBANOCCI SERIES IN JAVA //
import java.util.Scanner;
public class Fibanocci{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int first = 0, second = 1;
        
        // FIBANOCCI SERIES UPTO n NUMBERS //

        System.out.println("Enter the number to get the fibanocci series of N numbers: ");
        int num = input.nextInt();
        System.out.print(first +" "+ second);
        for(int i = 2;i<num;i++){
            int third = first + second;
            System.out.print(" "+third);
            first = second;
            second = third;
        }
        System.out.println();

     /* FIBANOCCI SERIES UPTO THE GIVEN NUMBER */
        
        System.out.println("Enter the last number to END the series: ");
        int n = input.nextInt();
        int a = 0, b = 1;
        int c = a+b;
        System.out.print(a+" "+b);
        while(c < n){
            c = a + b;
            if(c > n){
                break;
            }
            System.out.print(" "+c);
            a = b;
            b = c;
        }
        System.out.println();
        input.close();
    }
}




















