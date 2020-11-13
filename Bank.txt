

import java.util.Scanner;

class Account{
 String cust_name,type;
 long account_num;
 double balance;
 boolean check_book;
 static double min=500.0,sercharge=100;
 Scanner ss=new Scanner(System.in);
 void getdata(){
  System.out.println("Enter the name of the customer:");
  cust_name=ss.nextLine();
  System.out.println("Enter the account number:");
  account_num=ss.nextLong();
  System.out.println("Enter the balance amount:");
  balance=ss.nextDouble();
 }
 void display(){
  System.out.println("Customer name:"+cust_name);
  System.out.println("Account number:"+account_num);
  System.out.println("Current Balance:"+balance);
 }
}
class Savings extends Account{
 double interest,rate=0.03,withdraw_amt;
 int n,time;
 Scanner ss=new Scanner(System.in);
 void calc_interest(){
  System.out.println("Enter the time in years:");
  time=ss.nextInt();
  System.out.println("Enter the number of times the interest is to be compunded :");
  n=ss.nextInt();
  interest=balance*(Math.pow((1+(rate/n)),(time*n)));
  balance+=interest;
  System.out.println("The interestamount is:"+interest);
  System.out.println("The balanceafter calculating the interest is:"+balance);
 }
 void withdrawal(){
  System.out.println("Enter the amount to be withdrawn:");
  withdraw_amt=ss.nextDouble();
  if(balance>withdraw_amt)
   balance-=withdraw_amt;
  else
   System.out.println("The balance amount is insufficient");
  System.out.println("The total balance after withdrawal is:"+balance);
 }
 void penalty(){
  if(balance<min){
   balance=balance-sercharge;
      System.out.println("The balance amount after the penalty:"+balance);
  }
  else
   System.out.println("No penalty is imposed.");
 }
}
class Current extends Account{
 Scanner ss=new Scanner(System.in);
 double deposit;
 void getdeposit(){
  System.out.println("Enter the amount to be deposited:");
  deposit=ss.nextDouble();
  balance+=deposit;
  System.out.println("The total balance after deposition is:"+balance);
 }
 void penalty(){
  if(balance<min){
   balance=balance-sercharge;
      System.out.println("The balance amount after the penalty:"+balance);
  }
  else
   System.out.println("No penalty is imposed.");
 }
}
class BankMain{
 public static void main(String args[]){
  int type;
  Savings s=new Savings();
  Current c=new Current();
  Scanner ss=new Scanner(System.in);
  System.out.println("Enter the type of account:");
  System.out.println("Enter 1 for Savings and 2 for Current:");
  type=ss.nextInt();
  if(type==1){
   int withdrw=0;
   s.getdata();
   s.display();
   s.calc_interest();
   System.out.println("Would you like to withdraw money from your account?");
   System.out.println("Enter 1 if yes and 2 if no:");
   withdrw=ss.nextInt();
   if(withdrw==1){
    s.withdrawal();
   }
   s.penalty();
  }
  if(type==2){
   int depositt=0;
   c.getdata();
   c.display();
   System.out.println("Would you like to deposit money to your account?");
   System.out.println("Enter 1 if yes and 2 if no:");
   depositt=ss.nextInt();
   if(depositt==1){
    c.getdeposit();
   }
   c.penalty();
  }
 }
}
