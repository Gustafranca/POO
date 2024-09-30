import java.util.Scanner;

public class AccountTest {
    
    public static void main(String[] args)
    {
        // objeto scanner
        Scanner input = new Scanner(System.in);
        //objeto myAccount
        Account myAccount = new Account("Gustavo",100.0);
        Account account1 = new Account("Maria Gabriela",50.0);
        Account account2 = new Account("Elane",1000.0);

        System.out.printf("Initial name is: %s%n Initial balance %.2f%n%n", 
        myAccount.getName(), myAccount.getBalance());
        System.out.printf("Initial name is: %s%n Initial balance %.2f%n%n", 
        account1.getName(), account1.getBalance());
        System.out.printf("Initial name is: %s%n Initial balance %.2f%n%n", 
        account2.getName(), account2.getBalance());

        System.out.println("Please enter the full name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        System.out.printf("Name in object myAccount is: %n%s%n",myAccount.getName());
        System.out.printf("Deposit: ");
        double depositAmount = input.nextDouble();
        myAccount.deposit(depositAmount);
        System.out.printf("New Amount: %.2f",myAccount.getBalance());
        System.out.println();

        System.out.println("Please enter the full name: ");
        theName = input.nextLine();
        account1.setName(theName);
        System.out.println();
        System.out.printf("Name in object account1 is: %n%s%n",account1.getName());
        System.out.printf("Deposit: ");
        depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("New Amount: %.2f",account1.getBalance());
        System.out.println();

        System.out.println("Please enter the full name: ");
        theName = input.nextLine();
        account2.setName(theName);
        System.out.println();
        System.out.printf("Name in object account2 is: %n%s%n", account2.getName());
        System.out.printf("Deposit: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);
        System.out.printf("New Amount: %.2f", account2.getBalance());
        System.out.println();

        input.close();
    }

}
