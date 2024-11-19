import java.util.Scanner;
public class PyramidPatternProg{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = in.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i); k++) {
                if (k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        in.close();
    }
}