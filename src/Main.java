public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double annual_rate = 9.99; // годовая процентная ставка
        int annuity_1 = service.calculate(1_000_000, 12, annual_rate);
        System.out.println("Ежемесячный платёж: " + annuity_1 + " р.");
        System.out.println("Процентная ставка: " + annual_rate + " %");

        System.out.println();
        int annuity_2 = service.calculate(1_000_000, 24, annual_rate);
        System.out.println("Ежемесячный платёж: " + annuity_2 + " р.");
        System.out.println("Процентная ставка: " + annual_rate + " %");

        System.out.println();
        int annuity_3 = service.calculate(1_000_000, 36, annual_rate);
        System.out.println("Ежемесячный платёж: " + annuity_3 + " р.");
        System.out.println("Процентная ставка: " + annual_rate + " %");
    }
}
