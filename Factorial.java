// FACTORIAL PROGRAM IN JAVA //
import java.util.Scanner;
class factnum {
public int facto(int num){
    if (num == 0){
        return 1;
    }
    else{
        return num * facto(num -1);
    }
}
}
public class Factorial {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input number: ");
        int n = input.nextInt();
        int fact = 1;

        //FACTORIAL PROGRAM IN JAVA WITHOUT RECURSION

        if(n<0){
            System.out.println("Can't find factorial for a negative number");
        }
        else{
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("The factorial for "+n +" is "  +fact);
        }

    //FACTORIAL PROGRAM IN JAVA WITH RECURSION
        if(n<0){
            System.out.println("Can't find factorial for a negative number");
        }
        else{
            factnum obj = new factnum();
            int result = obj.facto(n);
            System.out.println("The Factorial of "+n +" is: "+result);
        }
        
        input.close();
}
}
