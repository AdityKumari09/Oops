class Account {
    public String name;
    protected String email;
    private String password;

    // getter and setter method is used to access private elements :-
    public String getpassword()
    {
        return this.password;
    }

    public void setPassword(String pass)
    {
        this.password = pass;
    }
}

public class Test{
    public static void main(String[] agrs)
    {
        Account account1 = new Account();
        account1.name = "Adity";
        account1.email = "Aditykumari@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getpassword());
    }
}
