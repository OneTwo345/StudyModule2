package karaoke;

public class Drink {
    private String drinkName;
    private String drinkID;
    private int drinkForAge;
    private int priceDrink;
    private int quantity;

    public Drink(String drinkName, int drinkForAge, int priceDrink, int quantity, String drinkID) {
        this.drinkName = drinkName;
        this.drinkForAge = drinkForAge;
        this.priceDrink = priceDrink;
        this.quantity = quantity;
        this.drinkID = drinkID;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getDrinkForAge() {
        return drinkForAge;
    }

    public void setDrinkForAge(int drinkForAge) {
        this.drinkForAge = drinkForAge;
    }

    public int getPriceDrink() {
        return priceDrink;
    }

    public void setPriceDrink(int priceDrink) {
        this.priceDrink = priceDrink;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDrinkID() {
        return drinkID;
    }

    public void setDrinkID(String drinkID) {
        this.drinkID = drinkID;
    }
}
