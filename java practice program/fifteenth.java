/*
1. Take input string of numbers. Extract last four numbers from the string. 
Calculate the discount price of the product based on those four numbers.
*/

import java.util.*;
public class fifteenth {

    public static void calculateOfferPrice(String st) {
        if(!st.matches("[0-9]{6,8}")) {
            System.out.println("Invalid Input!!");
        }
        else{
            int price = Integer.valueOf(st.substring(st.length()-4));
            int discount=0;
            if(price<=10) {
                discount=0;
            }
            else if(price<=50) {
                discount=5;
            }
            else if(price<=500) {
                discount=15;
            }
            else if(price<=5000) {
                discount=105;
            }
            else {
                discount=1005;
            }
            System.out.println("MRP Rs. : " + price);
            System.out.println("Offer price : " + (price-discount));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter product code : ");
        String str=s.nextLine();
        s.close();
        calculateOfferPrice(str);
    }
}
