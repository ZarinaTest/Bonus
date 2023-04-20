public class Main {
    public static void main(String[] args) {

        System.out.println("Добрый день!");

        int deposit = 300;
        int account = 1500;
        int total = deposit + account;
        int bonus;
        if (account >= 1000) {
            bonus = account / 100;
        } else {
            bonus = 0;
        }
        int general = total + bonus;

        System.out.println("Ваш счет составляет: " + total);
        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Ваша итоговая сумма на счете составляет: " + general);

    }
}