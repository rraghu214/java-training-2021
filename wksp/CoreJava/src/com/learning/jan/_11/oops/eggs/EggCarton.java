package com.learning.jan._11.oops.eggs;

public class EggCarton {

    private int noofeggs;
    void setNoOfEggs(int eggs){

        noofeggs = eggs;

    }

    int cartons(){

        if (noofeggs%12 == 0)
            return noofeggs / 12;
        else
            return (noofeggs/12 +1);
    }


}
