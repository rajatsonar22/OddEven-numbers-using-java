import java.util.*;
public class OddEven{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        
        if(x % 2 == 0) {
            System.out.println("The number is EVEN");
        }
        else{
            System.out.println("The number is ODD ");
        }
    }
}