/*
Today's Main Assessment Question
Given input string:

1. If input contains other than alphabets and numbers, 
print "Invalid Input".

2. The first 4 characters represent the weight in grams,
and it should be greater than 999,else print "Invalid Weight".

3. The last 3 characters represent order number, 
which should be greater than 99.

4. Remaining part of string represents the flavor.

5. If weight of cake = 1340 grams, 
convert it to Kgs by dividing weight(grams) by 1000.
 (ie., 1340/1000=1.34Kg)

6 Calculate Total Cake Price.(Assume: Cost of cake=450/Kg)

7. Hint was given to reduce ans to 2 decimal places.
 System.out.printf("%.2f",price);

Sample Input 1:
1234Strawberry123

Sample Output 1:
Weight of Cake in Kgs: 1.23Kg
Order No is: 123
Flavor name: Strawberry
Cake Price is: 553.50 Rupees

Sample Input 2:
6544Butte%rSco@tch345

Sample Output 2:
Invalid Input

Sample Input 3:
1342ButterScotch23

Sample Output 3:
Invalid Order

Sample Input 4:
654Strawberry345

Sample Output 4:
Invalid Weight
*/

import java.util.*;
public class eighteenth {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter order code : ");
        String oc=s.nextLine();
        s.close();
        
        printIOrderDet(oc);
    }
    
    
    public static void printIOrderDet(String st) {
        int l=st.length();
        float cakePrice=450;
        
        if(!st.matches("[A-Za-z0-9]+")) {
            System.out.println("Invalid Code");
            return;
        }
        
        // if(!(Integer.parseInt(st.substring(0,3))>=0 && ( (st.charAt(3)>='0' && st.charAt(3)<='9')))) {
        //     System.out.println("Invalid weight");
        //     return;
        // }

        for(int i=1; i<4; i++) {
            if(!(st.charAt(i)>='0' && st.charAt(i)<='9' && st.charAt(0)>'0' && st.charAt(0)<='9')) {
                System.out.println("Invalid weight");
                return;
            }
        }
            
        if(!(Integer.parseInt(st.substring(l-2,l))>=0 && (st.charAt(l-3)>='0' && st.charAt(l-3)<='9'))) {
            System.out.println("Invalid order no.");
            return;
        }

        float weight = (Float.valueOf(st.substring(0,4)))/1000;
        float totAmount = weight*cakePrice;
        
        System.out.printf("Weight of cake in Kgs : %.2f Kgs\n",weight);
        System.out.println("Order no. is : " + st.substring(l-3,l));
        System.out.println("Flavour name is : " + st.substring(4,l-3));
        System.out.printf("Price of cake is : %.2f Rs.",totAmount);
    }
}
