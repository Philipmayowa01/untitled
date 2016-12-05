package proj1;

/**
 * Created by g on 12/1/2016.
 */
import java.util.Scanner;
public class Pro1 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);

        String set;
        System.out.println("enter your ex gf name");
        set=input.nextLine();
        pro2 obj1=new pro2();

        obj1.setname(set);
        System.out.println("enter a class");
        String classs=input.nextLine();
        obj1.setclass("the class is"+classs);
        System.out.println("enter age");
        int age=input.nextInt();
        obj1.setages(age);
        obj1.message();
        System.out.println(obj1.getclasses());
        System.out.println("your age"+ obj1.getages());

    }

}