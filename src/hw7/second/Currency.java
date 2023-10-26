package hw7.second;

public enum Currency {
    USD(36.58),
    EUR(38.56),
    GBP(44.21);

    private final double uah;

    Currency(double uah) {
        this.uah = uah;
    }

    public double getUah() {
        return uah;
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println(Currency.EUR.getUah());
    }
}