package proj1;

/**
 * Created by g on 12/3/2016.
 */
import java.util.Scanner;
public class compoundinterest {
           public static void main(String []args){
            Scanner input=new Scanner(System.in);
            double amount,principal,rate,year=1,years;int counter=0;
            System.out.println("enter a pricipal");
            principal=input.nextDouble();
            System.out.println("enter a rates");
            rate=input.nextDouble();
            System.out.println("enter a days");
            years=input.nextDouble();
            while(year<=years){
                counter++;




                amount=principal*Math.pow((1+rate), counter);
                System.out.printf(counter+" day"+" the amount is "+"%1.3f",amount);
                System.out.println();
                year++;

            }

        }
    }

