package test; /**
 * Created by Pretorian on 11/6/2016.
 */
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TypeCheckError;

import java.util.Scanner;

public class Sale {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        do {
            double price = 0;

            try {
                System.out.println("\n Enter list price: ");
                double listPrice = input.nextDouble();

                System.out.println("\n Enter your discount %: ");
                int discount = input.nextInt();

                price = (listPrice-(100/discount));
            }

            catch(Exception e){
                System.out.println("only a numbers" );

            }

            System.out.printf("Your prise is " + "%.2f", price);
        }
        while (true);
    }
}
