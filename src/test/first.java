package test; /**
 * Created by Pretorian on 11/5/2016.
 */
import java.util.Scanner;

public class first{
    public static void main(String arg[]){
        String fullName, address;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        fullName = in.nextLine();
        System.out.println("Enter your address: ");
        address = in.nextLine();


        System.out.println(fullName);
        System.out.println(address);
        }
}