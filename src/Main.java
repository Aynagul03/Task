import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance = 100;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму пополнения: ");
        int replenishment = in.nextInt();
        in.close();
        System.out.println("Ваша сумма: " + replenishment) ;

        int min = 1000;

        if (replenishment <= min) {
            int sum = balance + replenishment;
            System.out.println("Чек: " + sum);
            System.out.println("К сожалению, бонусные рубли не начислены, т.к.сумма полнения меньше 1001 руб.");
            return;
        }
        int bonus = replenishment / 100;
        System.out.println("Бонусов: " + bonus);

        int chek = balance + replenishment + bonus;
        System.out.println("Общая сумма: " + chek);
    }
}
