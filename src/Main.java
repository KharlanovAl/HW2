public class Main {
    public static void main(String[] args) {

        int cash = 100;
        int replenishment = 3500;
        int bonus = 0;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        }

        int finalBalance = cash + replenishment + bonus;

        System.out.println(finalBalance);

    }
}