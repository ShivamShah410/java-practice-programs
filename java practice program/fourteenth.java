/*
Take string as username and change to lowercase
Average of ascii values of that string 
Equivalent letter of that average is key
*/

import java.util.Scanner;
public class fourteenth {

    public static char getKey(String st) {
        int sum=0;
        for(int i=0; i<st.length(); i++) {
            sum=sum + (int)st.charAt(i);
        }
        sum=sum/st.length();
        return (char)sum;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your username : ");
        String uN=s.nextLine();
        s.close();
        System.out.println("Your key is : " + getKey(uN));
    }
}
