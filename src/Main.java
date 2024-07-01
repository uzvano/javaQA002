public class Main {
    public static void main(String[] args) {

        int balance = 250; // сумма на счёте
        int sum = 1200; // сумма пополнения
        int bonus;

        if (sum > 1000) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговая сумма на счёте: " + (balance + sum + bonus));
        System.out.println("Бонусные рубли: " + bonus);

    }
}
