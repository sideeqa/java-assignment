import java.util.Scanner;
public class CreditCard{
public static void main(String[] args){
Scanner input = new Scanner(System.in);




System.out.println("Enter Bank name");
String name= input.nextLine();


//
//int counter =1;
//
//long unlimited =10000000;
//
System.out.print("Enter November first balances");
int firstBalance = input.nextInt();

System.out.print("Enter Total dept in November");
int total = input.nextInt();

System.out.print("Enter Total credit in November");
int credit = input.nextInt();

System.out.print("Enter Maximum credit limit");
int max = input.nextInt();
 
int newBalance = firstBalance + total * credit;


System.out.printf("New balance is %d%n:", newBalance);

}

}
