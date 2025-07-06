public class Main {
    public static void main(String[] args) {

        int nalichie = 100;
        int popolnenie = 3500;
        int bonus = 0;
        if (popolnenie >= 1000) {
            bonus = popolnenie / 100;
        }

        int finalBalance = nalichie + popolnenie + bonus;

        System.out.println(finalBalance);

    }
}