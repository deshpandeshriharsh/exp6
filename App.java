public class App {
    public int balance;

    public App(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String args[]) {
        App a = new App(5000);
        a.deposit(700);
        System.out.println("Balance After deposit of 800: " + a.getBalance());
        a.withdraw(400);
        System.out.println("Balance After withdraw of 400: " + a.getBalance());
    }
}
