package StoreHouse;
import Ingredients.*;
public class Storage {
    private Ingredient items[];

    public void setItems(int numOfItems){
        if(numOfItems > 0){
            items = new Ingredient[numOfItems];
        }
    }

    public void addIngrediant(Ingredient item){
        for(int i = 0; i < items.length; i++){
            if(items[i] == null){
                items[i] == item;
                return;
            }
        }
    }
}