import java.util.Scanner;
class BankAccount{
    int accNo,balance;
    String name ,city;
    Scanner sc = new Scanner(System.in);
    public BankAccount(){
        balance = 1000;
    }
    public void addCustData(){
        System.out.println("Enter customer A/C :");
        accNo = sc.nextInt();
        System.out.println("Enter customer name : ");
        name = sc.next();
        System.out.println("Enter customer city : ");
        city = sc.next();
    }
    public void showCustData(){
        System.out.println("Customer A/C : "+ accNo);
        System.out.println("Customer name : " + name);
        System.out.println("Customer city : " + city);
        System.out.println("Account Balance : " + balance);
    }
    public void deposit(){
        System.out.println("Enter amount to deposit : ");
        int amt = sc.nextInt();
        balance += amt;
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw : ");
        int amt = sc.nextInt();
        if(balance-amt>= 1000){
            balance -= amt;
        }
        else{
            System.out.println("Insufficient balance");
        }
        
    }
   
}

class SavingAccount extends BankAccount{

}
class BankingSystem{
    public static void main(String[] args){
        //BankAccount obj = new BankAccount();
        SavingAccount obj = new SavingAccount();
        Scanner sc1 = new Scanner(System.in);
        while(true){
            System.out.println("1. Add Customer data ");
            System.out.println("2. Show Customer data ");
            System.out.println("3. Deposit  ");
            System.out.println("4. Withdraw ");
            System.out.println("5.Exit");
            int n = sc1.nextInt();
            switch(n){
                case 1: obj.addCustData();break;
                case 2: obj.showCustData();break;
                case 3: obj.deposit();break;
                case 4: obj.withdraw();break;
                case 0: sc1.close();System.exit(0);break;
                
            }
        }
      
    }
}