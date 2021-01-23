package com.learning.jan._18.oops.inheritance;

public abstract class Item {

    public abstract void calculatePrice();

    private String id;
    private String desc;
    //private double price;


    public Item() {
        System.out.println("Item default constructor");
    }

    public Item(String id, String desc) {

        System.out.println("Item param constructor");
        this.id = id;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
