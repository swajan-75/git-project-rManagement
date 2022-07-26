package Ingredients;
abstract public class Ingredient {
    private final String inName;
    private double inQuantity;
    
    public Ingredient(String inName, double inQuantity){
        this.inName = inName;
        if(inQuantity > 0){
            this.inQuantity = inQuantity;
        }
    }
    public void setInName(String inName){
        if(this.inName == null){
            this.inName = inName;
        }
    }
    public void addQuan(double amount){
        if(amount > 0){
            this.inQuantity += amount;
        }
    }
    public double getQuan(){
        return inQuantity;
    }
    public String getInName(){
        return inName;
    }

}