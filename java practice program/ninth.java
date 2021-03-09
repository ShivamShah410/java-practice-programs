/*
input : psvy , 4
find the difference between p&s i.e 2 and print next 4 letters
output : behk
*/

import java.util.*;
public class ninth {

    public static void printNextPattern(String st, int size) {
        st=st.toLowerCase();
        
        // for(int i=0; i<st.length(); i++) {
        //     if(st.charAt(i)<'a' || st.charAt(i)>'z') {
        //         System.out.println("Invalid Input");
        //         return;
        //     }
        // }

        if(!st.matches("[a-z]*")) {
            System.out.println("Invalid Input");
            return;
        }

        int diff = st.charAt(1) - st.charAt(0);
        String ans="";
        int temp=(int)st.charAt(3);
        for(int i=0; i<size; i++) {
            temp=temp+diff;
            if(temp>122) {
                temp=temp-26;
            }
            ans = ans + (char)temp;
        }
        System.out.println("Output is : "+ ans);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str=s.nextLine();
        System.out.println("Enter no. of letters : ");
        int size=s.nextInt();
        s.close();
        printNextPattern(str, size);
    }
}
