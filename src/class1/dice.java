package class1;




    import java.util.Random;
    public class dice {
        public static void main(String []args){
            Random dice=new Random();
            int number1,number2,total;
            for(int roll=1;roll<=1;roll++){
                number1=1+dice.nextInt(6);
                System.out.println("the first dice come up "+number1);
                number2=1+dice.nextInt(6);
                System.out.println("the second dice come up "+number2);
                total=number1+number2;
                System.out.println("your total roll is "+total);
            }
        }
    }



