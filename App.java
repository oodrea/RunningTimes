import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.*;

public class App {
    private static Scanner sc;
    public static void main(String[] args) throws Exception {
        String word;
        sc = new Scanner(System.in);
        System.out.print("Please Enter Word: ");
        word = sc.nextLine();

        System.out.println("\nYou have entered: "+word);

        String arr1[] = new String[word.length()];
        String arr2[] = new String[word.length()];

        ArrayList<Integer> suffix_index = new ArrayList<Integer>();
        int suffix_array[] = new int[word.length()];

        int n=word.length();
        while(n>0){
            for(int i=Math.abs(word.length()-n); i<n;i++){
                System.out.print(word.charAt(i));
            }
            System.out.println("");
            n--;
        }
    }
}
