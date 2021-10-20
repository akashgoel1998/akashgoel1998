import java.util.*;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the cost of the item for n days");
 int days = sc.nextInt();
 System.out.println("Enter the value of n");
 int num = sc.nextInt();
 
 try{
 int cost = days/num;
 System.out.println("Cost per day of the item is "+cost);
 
 }catch(ArithmeticException e){
 System.out.println(e);
 }
 }
}
