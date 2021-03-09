/* 
Ques2) multiple numbers are given by user
for a given number if its number count is even sum all the numbers at even place
If number count is odd sum all the numbers at odd place
Then sum the results for all the inputs and print
Ex: enter size
5
Enter numbers
123(1+3=4) 
2536(5+6=11) 
2(2) 
57(7) 
76542(7+5+2=14) 
Output: 38 (4+11+2+7+14) 
*/

import java.util.*;
public class second{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = s.nextInt();
        s.nextLine();
        String[] numbers = new String[size];
        System.out.println("Enter Element : ");
        for(int i=0; i<size; i++){
            numbers[i]=s.nextLine();
        }

        s.close();
        System.out.println("Your Inputs");
        for(String i : numbers){
            System.out.println(i);
        }
        
        int sum=0;
        for(int j=0; j<size; j++){

            if(numbers[j].length()%2==0){
                for(int k=1; k<numbers[j].length(); k=k+2){
                    sum = sum + Integer.valueOf(String.valueOf(numbers[j].charAt(k)));
                }
            }
            else{
                for(int m=0; m<numbers[j].length(); m=m+2){
                    sum = sum + Integer.valueOf(String.valueOf(numbers[j].charAt(m)));
                }
            }
        }
        System.out.println("Final Answer : " + sum);
    }
}