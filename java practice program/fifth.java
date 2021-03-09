/*
Take string as username and change to lowercase
Average of ascii values of that string 
Equivalent letter of that average is key
*/

import java.util.*;
public class fifth {
    public static char getPassKey(String un) {
        int sum=0;
        for(int i=0; i<un.length(); i++) {
            sum = sum + (int)un.charAt(i);
        }
        sum=sum/un.length();
        return (char)sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your user name : ");
        String userName=s.nextLine().toLowerCase();
        s.close();
        System.out.println("Your key is : " + getPassKey(userName));
    }
}
