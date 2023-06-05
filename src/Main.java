public class Main {

    public static void main(String[] args) {

        int ticket = 15_482; // стоимость билета
        int rubles = 20; // для одной бонусной мили

        System.out.println("Купили билет. Начислено милей за билет");
        System.out.println((ticket / rubles) + " Количество бонусных миль");

    }
}