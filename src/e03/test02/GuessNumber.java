package experiment.e03.test02;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("给你一个1至100之间的整数，请猜测这个数");
        int realNumber = rand.nextInt(100) + 1;
        int yourGuess = 0;
        System.out.println("输入您的猜测：");
        yourGuess = reader.nextInt();
        while (yourGuess != realNumber) {
            if (realNumber < yourGuess) {
                System.out.println("猜大了，再输入你的猜测");
                yourGuess = reader.nextInt();
            } else if (realNumber > yourGuess) {
                System.out.println("猜小了，再输入你的猜测");
                yourGuess = reader.nextInt();
            }
        }
        System.out.println("猜对了！");
    }
}
