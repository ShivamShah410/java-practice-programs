/*

take a string input, and then take a letter input. 
Now take the indexes where that letter is present in the sentences and add all the indexes. 
Now do the vice verse and add all where it is not present. Finally, print the differences

*/



import java.util.Scanner;
import java.lang.Math;

public class thirteenth {

    public static void letterMatch(String st, char c) {
        int sum_p=0;
        int sum_a=0;
        for(int i=0; i<st.length(); i++) {
            if(st.charAt(i)==c) {
                sum_p=sum_p+i;
            }
            else{
                sum_a=sum_a+i;
            }
        }
        System.out.println("Output is : " + Math.abs(sum_a-sum_p));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=s.nextLine();
        System.out.println("Enter the letter : ");
        char c = s.nextLine().charAt(0);
        s.close();
        letterMatch(str, c);
    }
}
