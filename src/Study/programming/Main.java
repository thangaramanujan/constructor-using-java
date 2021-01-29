package Study.programming;

public class Main {

    public static void main(String[] args) {

        Account sriAccount = new Account(); //"12345", 0.00, "Sriram", "myemail@sri.com", "9878564345" );
        System.out.println(sriAccount.getNumber());
        System.out.println(sriAccount.getBalance());

        sriAccount.withdrawal(100.0);

        sriAccount.deposit(50.0);
        sriAccount.withdrawal(100.0);

        sriAccount.deposit(51.0);
        sriAccount.withdrawal(100.0);

        Account rupiAccount = new Account("Karthi", "karthi@email.com", "12345");
        System.out.println(rupiAccount.getNumber() + " name " + sriAccount.getCustomerName());

    }
}
