package com.assignments.PPT.P2CoreJava3_OOPS.A3DiscountSystem;

public class DiscountRate {
    static double serviceDiscountPremium = 0.2;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountSilver = 0.1;
    static double productDiscountPremium = 0.1;
    static double productDiscountGold = 0.1;
    static double productDiscountSilver = 0.1;

    static double getServiceDiscountRate(){
        return 0;
    }

    static double getServiceDiscountRate(String memberType){

        if (memberType == "GOLD")
                return serviceDiscountGold;
        else if (memberType == "SILVER")
            return serviceDiscountSilver;
        else
            return serviceDiscountPremium;

    }

    static double getProductDiscountRate(){
        return 0;
    }

    static double getProductDiscountRate(String memberType){

        if (memberType == "GOLD")
            return productDiscountGold;
        else if (memberType == "SILVER")
            return productDiscountSilver;
        else
            return productDiscountPremium;

    }
}
