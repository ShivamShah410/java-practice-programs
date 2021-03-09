/*
Write a program to check  the  PAN card no is valid or not. 
Generally a PAN no is a mix of both numbers and alphabets. 
It should have exactly 10 characters, 
in which, the first 5 characters should be upper case,
the next 4 should be numbers, and last one should be an upper case character. 
If the PAN no doesn't match the pattern print "Invalid PAN no".
*/

import java.util.*;
public class tenth {

    public static void passwordValidation(String st) {
        if(st.length()!=10) {
            System.out.println("Invalid!!");
        }
        else {
            boolean m = st.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
            if(m) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your PAN number : ");
        String str=s.nextLine();
        s.close();
        passwordValidation(str);
    }
}
