class Bank
{
	private double Balance;

    public Bank()               // when ever object is created,constructor initialize the Balance variable.
    {
        Balance = 100;
    }

    public void deposit(double amount)
    {
        Balance = Balance + amount;
    }
    public void withdrawal(double amount)
    {
        Balance = Balance - amount;
    }
    public void display()
    {
        System.out.println("Balance is := "+Balance);
    }
}

class BankApp
{
    public static void main(String args[])
    {
        //------------------------User-1------------------------------------------//
        Bank shubham = new Bank();
        shubham.display();
        shubham.deposit(100);
        shubham.display();
        shubham.withdrawal(150);
        shubham.display();
        //------------------------User-2------------------------------------------//
        Bank ankit = new Bank();
        ankit.display();
        ankit.deposit(500);
        ankit.display();
        ankit.withdrawal(100);
        ankit.display();

        //------------------------User-n------------------------------------------//

    }
}
