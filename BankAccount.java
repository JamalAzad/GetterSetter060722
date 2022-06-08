//4. Create a class named "BankAccount".
// This class has 4 private variables: String name, String email, int id and String accountType.
//Create following methods:
//setName: This method set the value for name variable.
//getName: This method returns the value of variable name.
//setEmail: This method set the value for email variable.
//getEmail: This method returns the value of variable email.
//setId: If value of id is less than 10 it sets value of id to 11. In other case it will set the value to whatever value user has passed.
//getId: This method returns the value of variable id.
//setAccountType:(For this method you can pass two values only "s" or "c") It sets the value of accountType variable to "Savings Account" if user pass value "s" in other case when
//user will pass value "c" it will set value of AccountType variable to "Current Account".
//getAccountType: This method returns the value of variable accountType.

public class BankAccount {
    private String name;
    private String email;
    private int id;
    private String accountType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        if (id < 10) {
            this.id = 11;
        }
        else {
            this.id = id;
        }

    }

    public int getId() {
        return id;
    }

    public void setAccountType(String accountType) {

        if (accountType == "s" || accountType == "S")
        {
            this.accountType="Savings Account";
                    }
        else if (accountType == "c" || accountType == "C") {
            this.accountType="Current Account";
        }
        else {
            this.accountType=null;
        }
    }
    public String getAccountType() {
        return this.accountType;
    }
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setName("Jamal Azad");
        bankAccount.setEmail("jamal@mail.com");
        bankAccount.setId(9);
        bankAccount.setAccountType("R");
        System.out.println("Name: "+bankAccount.getName());
        System.out.println("Email: "+bankAccount.getEmail());
        System.out.println("ID No: "+bankAccount.getId());
        System.out.println("Account Type: "+bankAccount.getAccountType());
    }
}
