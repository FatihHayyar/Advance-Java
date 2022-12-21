package enumType;

public enum TransactionType {
    depozit (5),
    withdraw(2),
    transfer(3),
    payment(4),
    other(1);
private final int transactionCode;

    public int getTransactionCode() {
        return transactionCode;
    }

    private TransactionType(int code) {
    this.transactionCode = code;
}
}
