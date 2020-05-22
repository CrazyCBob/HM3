import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int q = 0;
        int w = -1;
        int number = random.nextInt(10);
        while (q < 3 && w != number) {
            System.out.println("Угадай число от 0 до 9");
            System.out.print("Введи число: ");
            w = sc.nextInt();
            if (number != w) {
                System.out.println("Твое число " +
                        ((w > number)? "меньше" : "больше"));
                q++;
            }
        }
        System.out.println("Ты " +
                ((w == number)? "победил!" : "проиграл: " + number));
    }
}