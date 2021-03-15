package com.example.fyz;

public class Thing {
    private String name;
    private String description;
    private int imageResourceId;

    // drinks is an array of Drinks
    public static final Thing[] drinks = {
            new Thing("Latte", "A couple of espresso shot with steamed milk",
                    R.drawable.latte),
            new Thing("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.cappuccino),
            new Thing("Filter", "Height quality beans roasted and brewed fresh",
                    R.drawable.filter)
    };

    //Each Drink has a name, description, and an image resource
    private Thing(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return  name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
