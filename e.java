//WRITE A FUNCTION THAT TAKES IN THE RADIUS AS INPUT AND RETURNS THE CIRCUMFERENCE OF A CRICLE .
import java.util.*;
public class e{
    public static double circumferenceofCricle(double r ){
        return  2 * Math.PI * r ; 
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.print(" Circumference of circle = " + circumferenceofCricle(r));
    }
  
}
