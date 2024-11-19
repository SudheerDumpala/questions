import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char Arr1[] = s1.toCharArray();
            char Arr2[] = s2.toCharArray();
            for(char c:Arr1){
                System.out.println(c);
            }
            Arrays.sort(Arr1);
            for(char c:Arr1){
                System.out.println(c);
            }
            Arrays.sort(Arr2);
            return Arrays.equals(Arr1,Arr2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String s1: ");
        String s1 = in.nextLine();
        System.out.println("Enter String s2: ");
        String s2 = in.nextLine();
        boolean result = isAnagram(s1,s2);
        System.out.println(result ? "Anagram":"Not an Anagram");
    }
}
