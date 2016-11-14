package calcTax;

import java.lang.reflect.Constructor;

/**
 * Created by Pretorian on 11/6/2016.
 */
public class Tax {

    double grossIncome;
    String state;
    int dependents;

    Tax (double gi, String st, int depen){
            grossIncome = gi;
            state = st;
            dependents = depen;
    }

    public Tax() {
    }

    public double calcTax(){
        //calculate taxe
        if (grossIncome <= 1000 && dependents <= 2){
            return grossIncome*dependents;
        }
        else if (grossIncome >= 2000 && dependents >= 3){
            return grossIncome/dependents;
        }

        else{
            return grossIncome+dependents;
        }
    }
}
