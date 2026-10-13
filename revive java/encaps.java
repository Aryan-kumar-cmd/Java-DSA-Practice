class bankaccount{
    private double balance;

    public void deposit(double amount){
        if(amount>0){
        balance=balance+amount;
        }
    }
    public double totalamount(){
        return balance;
    }
}

public class encaps{
    public static void main(String[] args) {
        bankaccount b1=new bankaccount();
        b1.deposit(5000);
        System.out.println(b1.totalamount());
        
    }
}