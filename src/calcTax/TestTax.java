package calcTax;

/**
 * Created by Pretorian on 11/6/2016.
 */
public class TestTax {
    private int foo = 123123;
    private int foo2 = 123123;
    private int foo34 = 123123;
    private int foo3 = 123123;

    public static void main(String[] args){

        //Tax t= new Tax(2000, "JI", 2);
        NJTax t= new NJTax(3000, "JI", 2, 4);


        t.grossIncome = 2000;
        t.dependents = 7;
        t.state = "NJ";


        double yourTax = t.calcTax();

        double njt = t.adjForStud(yourTax);

        System.out.printf("your Tax is $%.2f%n", njt);
        System.out.printf("%d", t.i);
    }
}
