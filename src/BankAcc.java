public class BankAcc {

    private String number;
    private int balance;
    private  boolean isActive;

    public BankAcc() {
    }

    public BankAcc(String number, int balance, boolean isActive) {
        this.number = number;
        this.balance = balance;
        this.isActive = isActive;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void activateAcc() {
        isActive = true;
        System.out.println("Аккаунт активен");
    }

    public void diActiveAcc() {
        isActive = false;
        System.out.println("Ваш аккаунт заблокирован, потому что вы лох");
    }



    @Override
    public String toString() {
        return "BankAcc{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", isActive=" + isActive +
                '}';
    }
}
