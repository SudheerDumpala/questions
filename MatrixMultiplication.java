//  Multiplication of two n x n matrices in java 
import java.util.InputMismatchException;
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the number of rows and columns: ");
            int nrows = input.nextInt();
            int ncolumns = input.nextInt();
            int[][] matrix1 = new int[nrows][ncolumns];
            int [][] matrix2 = new int[nrows][ncolumns];
            System.out.println("Enter the elements into the matrix 1: ");
            for(int i=0;i<nrows;i++){
                for(int j=0;j<ncolumns;j++){
                    matrix1[i][j] = input.nextInt();
                }
            }
            System.out.println("Enter the elements into the matrix 2: ");
            for(int i=0;i<nrows;i++){
                for(int j=0;j<ncolumns;j++){
                    matrix2[i][j] = input.nextInt();
                }
            }
            System.out.println();
            System.out.println("Matrix 1:");
            for(int i=0;i<nrows;i++){
                for(int j=0;j<ncolumns;j++){
                    System.out.print(matrix1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Matrix 2:");
            for(int i=0;i<nrows;i++){
                for(int j=0;j<ncolumns;j++){
                    System.out.print(matrix2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            int[][] matrix3 = new int [nrows][ncolumns];
            for(int i =0;i<nrows;i++){
                for(int j=0;j<ncolumns;j++){
                    for(int k =0;k< nrows;k++){
                        matrix3 [i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Resultant Matrix after Multiplication:");
            for(int i =0;i<nrows;i++){
                for(int j=0;j<ncolumns;j++){
                    System.out.print(matrix3 [i][j]+" ");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect type of input! please Enter the input of String format");
        }
        finally{
            input.close();
        }
    }
}
