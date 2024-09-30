package e05.test02;

public class Bank {
    public int savedMoney;
    int year;
    double interest;
    double interestRate = 0.29;

    public double computerInterest() {
        interest = year * interestRate * savedMoney;
        return interest;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }
}