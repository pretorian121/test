package calcTax;

/**
 * Created by Pretorian on 11/6/2016.
 */
public class NJTax extends Tax {

    int i = 1;

    NJTax (double gi, String st, int depen, int i){
       super(gi, st, depen);
       this.i = i;
    }

    public double adjForStud(double yourTax){
        return yourTax - 500;
    }

}
