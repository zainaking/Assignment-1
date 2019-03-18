import java.sql.SQLOutput;
import java.util.Random;

public class main {


public static void main (String[] args) {

    Random randm = new Random();

    int x = randm.nextInt(100) + 1;

    System.out.println(x);


    if (x > 90) {
        System.out.println("A, Good Job!!");


    } else if (x >= 80 && x < 90) {
        System.out.println("B, you did ard!");


    } else if (x >= 70 && x < 80) {
        System.out.println("C Girl, try again!!");


    }
    if (x >= 60 && x < 70) {
        System.out.println("D is for DoRk!!");


    } else if (x < 60) {
        System.out.println("F is for free, free home, cuz that equals homeless homie!!");


    }


}
}