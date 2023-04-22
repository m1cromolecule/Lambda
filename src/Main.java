public class Main {
    public static void main(String[] args) {
        Lambda plus;
        Lambda minus;
        Lambda umnoj;
        Lambda razdel;

        plus = (x, y) -> x + y;
        minus = (x, y) -> x - y;
        umnoj = (x, y) -> x * y;
        razdel = (x, y) -> x / y;

        System.out.println(plus.calculate(2, 2));
        System.out.println(minus.calculate(2, 2));
        System.out.println(umnoj.calculate(2, 2));
        System.out.println(razdel.calculate(2, 2));
    }

    @FunctionalInterface
    interface Lambda {
        int calculate(int x, int y);
    }
}
