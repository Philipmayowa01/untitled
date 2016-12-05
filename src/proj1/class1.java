package proj1;

/**
 * Created by g on 12/2/2016.
 */

    import java.util.Scanner;
    public class class1{
        private String name,classes;int age;
//default constructor
        public  class1(){
            Scanner input=new Scanner(System.in);
            System.out.println("enter your name");
            name=input.nextLine();
            System.out.println("enter your class");
            classes=input.nextLine();
            System.out.println("enter your age");
            age =input.nextInt();
        }
        //parametarized constructor
        public class1(String a,String b,int d){
            name=a;
            classes=b;
            age=d;
        }
        public String getname(){
            return name;
        }
        public String getclasses(){
            return classes;
        }
        public int getage(){
            return age;
        }
    }

