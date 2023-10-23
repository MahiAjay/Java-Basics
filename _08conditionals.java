import java.util.Scanner;
 public class _08conditionals {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = scan.nextInt();

        if (age>20) {
            System.out.println("You are an adult");
        } else if (age>5) {
          System.out.println("You are not a kid");            
        }
        else {
            System.out.println("You are a kid");
            
        }
        
    }
    
}
//to comment out selected lines use ctrl + /