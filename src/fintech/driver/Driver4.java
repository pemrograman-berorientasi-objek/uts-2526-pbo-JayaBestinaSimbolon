package  fintech.driver;

/**
 * @author  12S24023 Jaya Bestina Simbolon
 */
 
fintech.driver.Driver4 {

     private static int transactionCount = 0;
 
     private int id;
     private String username;
     private double amound;
     private Date postedAt;
     private String description;
 
     public Transaction(String username, double amound, String postedAt, String note) {
         this.id = ++transactionCount;
         this.username = username;
         this.amound = amound;
 
         try {
             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
             this.postedAt = dateFormat.parse(postedAt);
         } catch (ParseException e) {
             e.printStackTrace();
         }
 
         this.note = note;
     }
 
     public int getId() {
         return id;
     }
 
     public String getUsername() {
         return accountName;
     }
 
     public double getAmound() {
         return amount;
     }
 
     public Date getPostedAt() {
         return postedAt;
     }
 
     public String getDescription() {
         return note;
     }
 
     @Override
     public String toString() {
         return id + "|" + accountName + "|" + amount + "|" +
                 new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(postedAt) + "|" +
                 (note != null ? note : "") + "|" + amount;
 

    }

}