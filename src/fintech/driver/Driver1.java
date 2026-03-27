package  fintech.driver;

/**
 * @author 12S24023 Jaya Bestina Simbolonn
 */
import java.util.Scanner;
import fintech.driver.account;

fintech.driver.Driver1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        if (command.equals("create-Account")) {
             String username = scanner.nextLine();
             String name = scanner.nextLine();
             double balance = scanner.nextLine();
             Account account = new account(username, name, balance);
            System.out.println(Account);

        }

        scanner.close();
    }
}

