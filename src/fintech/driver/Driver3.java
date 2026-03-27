package fintech.driver;

/**
 * @author  12S24023 Jaya Bestina Simbolonn
 */
 
fintech.driver.Driver3 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine().trim();

            if (command.equals("create-account1 && create-account2")) {
             String username = scanner.nextLine();
             String name = scanner.nextLine();
             double balance = scanner.nextLine();
             Account account = new account(username, name, balance);
                System.out.println(account.toString());

            
                
            } else if (command.equals("create-transaction")) {

            }
        }
         scanner.close();
    }

}