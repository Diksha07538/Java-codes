//WRITE A PROGRAM TO ENTER THE NUMBERS TILL THE USER WANTS AND AT THE END IT SHOULD DISPLAY THE COUNT OF POSITIVE , NEGATIVE AND ZEROS ENTERED .
import java.util.*;
public class h {
    public static void infinitenumber(){
            Scanner sc = new Scanner(System.in);
        int positive = 0; int  negative = 0, zero = 0;
        char choice;
        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n>0){
                positive++;
            }else if(n<0){
                    negative++;
            }else {
                zero++;
            }
            System.out.print("Do you want to continue? (y/n): ");
         choice = sc.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');
          System.out.println("Positive numbers count = " + positive);
        System.out.println("Negative numbers count = " + negative);
        System.out.println("Zero count = " + zero); 
    }
    public static void main(String args []){
        infinitenumber();

    }
}
