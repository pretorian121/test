package Cars;

/**
 * Created by Pretorian on 11/6/2016.
 */
class JamesBondCar extends Car{

    int currentSubmergeDepth;
    boolean isGunOnBoard = true;
    final String MANUFACTURER = "GAZ";

    void submerge(){
        currentSubmergeDepth = 50;
    }

    void surface(){

    }
}
