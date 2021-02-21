package com.assignments.PPTProbs.P2CoreJava3_OOPS.A3DiscountSystem;

import static com.assignments.PPTProbs.P2CoreJava3_OOPS.A3DiscountSystem.DiscountRate.*;

public class VisitBkp {

   Customer cust;
    //date Date;
    private double serviceExpense;
    private double productExpense;
    private double discount;
    private double totalExpense;

    VisitBkp(String name, Customer cust){

        cust.setName(name);
    }
    public String getName(){
        return cust.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        if(cust.isMember() == false){
            discount = 0;

        }
        else if(cust.getMemberType() == "GOLD"){
            setServiceExpense((getServiceExpense() * serviceDiscountGold));
            setProductExpense(getServiceExpense() * productDiscountGold);
            //return getServiceExpense() + getProductExpense();
        }
        else if(cust.getMemberType() == "SILVER"){
            setServiceExpense((getServiceExpense() * serviceDiscountSilver));
            setProductExpense(getServiceExpense() * productDiscountSilver);
            //return getServiceExpense() + getProductExpense();
        }
        else{
            setServiceExpense((getServiceExpense() * serviceDiscountPremium));
            setProductExpense(getServiceExpense() * productDiscountPremium);

        }
        totalExpense =  getServiceExpense() + getProductExpense();
        return totalExpense;

    }

    @Override
    public String toString() {
        return "Visit{" +
                "cust=" + cust +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ", Total Expense=" + totalExpense +
                '}';
    }
}
