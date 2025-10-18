public class Account {
    public String id;
    public String name;
    public int balance = 0;
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }
    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance = balance + amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString() {
        System.out.println("Account[id=" + id + ",name=" + name + ",balance=" + balance + "]");
        return id + name + balance;
    }
}