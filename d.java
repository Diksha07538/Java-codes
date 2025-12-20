//WRTIE A FUNCTION WHICH TAKES IN 2NUMBERS AND RETURNS THE GREATER OF THOSE TWO
import java.util.*;
public class d {
    public static int printGreater(int a, int b) {
         
      if( a >= b){
        System.out.println(" a is greater");
      }else{
        System.out.println(" b is greater");
      }  
       return (a>b) ? a:b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater = printGreater(a,b);
         System.out.println("Greater number is: " + greater);
    }

}