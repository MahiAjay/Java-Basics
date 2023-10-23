import java.util.Scanner;
public class _09casess {
    public static void main(String[]args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = scan.nextInt();
           switch (age) {
            case 12:
            System.out.println("you are 12 years old");
                break;
                case 22:
                System.out.println("you are 22 years old");
                    break;
                    case 44:
                    System.out.println("you are 44 years old");
                        break;
                        case 56:
                        System.out.println("you are 56 years old");
                            break;
           
            default:
            System.out.println("You did not match any of the cases.");
                break;
           }    
    }
    
}
