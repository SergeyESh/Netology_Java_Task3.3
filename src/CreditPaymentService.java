public class CreditPaymentService {
    public int calculate(int amount, int term, double annual_rate) {
        double monthly_rate;
        monthly_rate = annual_rate / 12 / 100; // месячная процентная ставка
        double ratio; // коэфициент аннуитета
        ratio = (monthly_rate * Math.pow((1 + monthly_rate), term)) / (Math.pow((1 + monthly_rate), term) - 1);
        int annuity;
        annuity = (int) (amount * ratio);
        return annuity;
    }
}
