package Ingredients;
abstract public class Ingredient {
    private double flour;
    private double oil;
    //private double chesse;
    //private double chicken;
    //private double beef;
    //private double mutton;
    public void addFlour(double flour){
        if(flour > 0){
            this.flour += flour;
            return;
        }
    }
    public void addOil(double oil){
        if(oil > 0){
            this.oil += oil;
            return;
        }
    }

}