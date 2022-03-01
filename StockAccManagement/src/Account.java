public class Account {

    double amount = 0;

    public Account(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void credit(double creditAmount) {
        double totalCreditAmount = this.getAmount();
        totalCreditAmount += creditAmount;
        this.setAmount(totalCreditAmount);
        System.out.println("Balance amount : " + this.getAmount());
    }

    public boolean debit(double debitAmount) {
        if (this.getAmount() - debitAmount < 0) {
            System.out.println("Insufficient amount");
            return false;
        }
        double totalDebitAmount = getAmount();
        totalDebitAmount -= debitAmount;
        this.setAmount(totalDebitAmount);
        System.out.println("Balance amount : " + this.getAmount());
        return true;
    }
}
