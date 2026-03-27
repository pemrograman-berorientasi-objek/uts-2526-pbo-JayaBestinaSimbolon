package  fintech.driver;

/**
 * @author  12S24023 Jaya Bestina Simbolonn
 */
 
import java.util.Scanner;
import fintech.model.Transaction;
import fintech.model.Account;

fintech.driver.Driver2 {


   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine().trim();

            if (command.equals("create-account")) {
             int id = scanner.nextLine();
             String username = scanner.nextLine();
             String name = scanner.nextLine();
             double balance = scanner.nextLine();
             Account account = new account(id, username, name, balance);
                System.out.println(account.toString());
                
            } else if (command.equals("create-transaction")) {
                int id = scanner.nextLine();
                String username = scanner.nextLine().trim();
                double amound = Double.parseDouble(scanner.nextLine().trim());
                String postedAt = scanner.nextLine().trim();
                String note = scanner.nextLine().trim();

                Transaction transaction = new Transaction(id, deposit, username, amound, description);
                System.out.println(transaction.id() + "|" + transaction.deposit() + "|" + transaction.username() + "|" +
                       transaction.getAmound() + "|" + transaction.getDescription  ());
                System.out.println(transaction.toString());
            }
        }

        scanner.close();
    }
}
