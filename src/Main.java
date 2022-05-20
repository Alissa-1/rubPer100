public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int income = 1800;
        int bonus;
        if (income > 1000) {
            bonus = income / 100;
            balance += bonus;
            System.out.println("Вам начислено " + bonus + " бонусов. Баланс составляет " + balance + " рублей.");
        } else {
            System.out.println("Вам начислено 0 бонусов");
        }
    }
}
