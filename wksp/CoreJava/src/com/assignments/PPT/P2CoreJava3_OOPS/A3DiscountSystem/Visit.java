package com.assignments.PPT.P2CoreJava3_OOPS.A3DiscountSystem;

import static com.assignments.PPT.P2CoreJava3_OOPS.A3DiscountSystem.DiscountRate.*;

public class Visit {

    //Customer cust;
    //date Date;
    private double serviceExpense;
    private double productExpense;
    private double discount;
    private double totalExpense;

    Visit(String name, Customer cust){

        cust.setName(name);
    }
    public String getName(Customer cust){
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

    public double getTotalExpense(Customer cust){
        if(cust.isMember() == false){
            discount = 0;

        }
        else if(cust.getMemberType() == "GOLD"){
            setServiceExpense(getServiceExpense() - (getServiceExpense() * serviceDiscountGold));
            setProductExpense(getProductExpense() - (getProductExpense() * productDiscountGold));
            //return getServiceExpense() + getProductExpense();
        }
        else if(cust.getMemberType() == "SILVER"){
            setServiceExpense(getServiceExpense() - (getServiceExpense() * serviceDiscountSilver));
            setProductExpense(getProductExpense() - (getProductExpense() * productDiscountSilver));
            //return getServiceExpense() + getProductExpense();
        }
        else{
            setServiceExpense(getServiceExpense() - (getServiceExpense() * serviceDiscountPremium));
            setProductExpense(getProductExpense() - (getProductExpense() * productDiscountPremium));

        }
        totalExpense =  getServiceExpense() + getProductExpense();
        return totalExpense;

    }

    @Override
    public String toString() {
        return "Visit{" + "serviceExpense=" + serviceExpense +", productExpense=" + productExpense +
                ", Total Expense=" + totalExpense +
                "}";
    }
}
