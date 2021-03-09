/*
print all the character found in the string
*/

import java.util.*;
public class seventh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = s.nextLine();
        s.close();
        printUniqueChar(str);
    }

    public static void printUniqueChar(String st) {
        HashSet<Character> hs = new HashSet<Character>();
        char[] c=st.toCharArray();
        Arrays.sort(c);
        for(char i : c) {
            hs.add(i);
        }

        //System.out.println(hs);
        for(char i : hs) {
            System.out.println(i);
        }
    }
}
