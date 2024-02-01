public class Main {
    public static void main(String[] args) {
        int balans = 200;//изначальный баланс
        int summ = 1250;//сумма пополнения
        if (summ > 1000){
            int bonus = (summ / 100);
            System.out.println("Бонус равен: " + bonus);
            System.out.println("Баланс равен: " + (summ+bonus+balans));
        } else {
            int bonus = 0;
            System.out.println("Бонус равен: " + bonus);
            System.out.println("Баланс равен: " + (summ+bonus+balans));
        }


    }

}