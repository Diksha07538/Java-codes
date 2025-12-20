//WRITE A FUNCTION TO PRINT THE SUM OG ALL ODD NUMBERS FROM 1 TO N 
import java.util.*;
public class b{
public static int sumofodd(int n){
    int sum = 0;
for (int i = 1; i<=n; i++){
   if ( i % 2 != 0){
    sum = sum + i;
   }
   
  }
  return sum;
}
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int result = sumofodd(n);
     System.out.println("Sum of odd numbers from 1 to " + n + " = " + result );
 }

}