package test;

import java.util.ArrayList;

/**
 * Created by Pretorian on 11/13/2016.
 */
public class Lists {
    public static void main(String[] arg) {

        ArrayList<Integer> myLotteryNumers = new ArrayList();
        myLotteryNumers.add(new Integer(6));
        myLotteryNumers.add(new Integer(3));

        myLotteryNumers.add((9));
        System.out.print(myLotteryNumers + "\n");

        for (Object object : myLotteryNumers) {
            System.out.println(object.getClass().getName());
        }


        int luckyNumber= myLotteryNumers.get(1);
        int luckyNumber1 = myLotteryNumers.get(2);

        System.out.println(luckyNumber);
        System.out.println(luckyNumber1);


    }

}
