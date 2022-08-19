public class CreditPaymentService {
    public int calculate(int amount, int term, double annualRate) {
        double monthlyRate;
        monthlyRate = annualRate / 12 / 100; // месячная процентная ставка
        double ratio; // коэфициент аннуитета
        ratio = (monthlyRate * Math.pow((1 + monthlyRate), term)) / (Math.pow((1 + monthlyRate), term) - 1);
        int annuity;
        annuity = (int) (amount * ratio);
        return annuity;
    }
}
