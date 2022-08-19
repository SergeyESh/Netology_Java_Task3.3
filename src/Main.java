public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double annualRate = 9.99; // годовая процентная ставка
        int annuity1 = service.calculate(1_000_000, 12, annualRate);
        System.out.println("Ежемесячный платёж: " + annuity1 + " р.");
        System.out.println("Процентная ставка: " + annualRate + " %");

        System.out.println();
        int annuity2 = service.calculate(1_000_000, 24, annualRate);
        System.out.println("Ежемесячный платёж: " + annuity2 + " р.");
        System.out.println("Процентная ставка: " + annualRate + " %");

        System.out.println();
        int annuity3 = service.calculate(1_000_000, 36, annualRate);
        System.out.println("Ежемесячный платёж: " + annuity3 + " р.");
        System.out.println("Процентная ставка: " + annualRate + " %");
    }
}
