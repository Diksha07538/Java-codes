//WRITE A FUNCTION THT TAKED IN AGE AS INPUT AND RETURNS IF THAT PERSON IS ELIGIBLE TO VOTE OR NOT. A PERSON OG AGE > 18 IS ELIGIBLE TO VOTE 
import java.util.*;
public class f {
    public static boolean eligibleforVoting(int age){
        if(age > 18 ){
            return true;
        }else{
            return false;
        }

    } 
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(eligibleforVoting(age)){
           System.out.print( "Eligible for Voting ");
        }else {
           System.out.print( "Not Eligible for Voting ");
        }
    }
}
