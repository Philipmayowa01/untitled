package proj1;

/**
 * Created by g on 12/3/2016.
 */

    import java.util.Random;

    public class dice2 {
        public static void main(String[] args) {
            Random dice = new Random();
            int number;
            String computermove;
            for (int roll = 1; roll <= 1; roll++) {
                number = dice.nextInt(3);
                switch (number) {
                    case 0:
                        computermove = "Rock";
                        System.out.println(computermove);
                        break;
                    case 1:
                        computermove = "sciss";
                        System.out.println(computermove);
                        break;
                    case 2:
                        computermove = "pape";
                        System.out.println(computermove);
                        break;
                    default:
                        computermove = "no value";

                }
            }
        }
    }

